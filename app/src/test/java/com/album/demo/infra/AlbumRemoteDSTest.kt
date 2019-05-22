package com.album.demo.infra

import com.album.demo.modules.album.domain.models.Album
import com.album.demo.modules.album.infra.AlbumDataSourceContract
import com.album.demo.modules.album.infra.remote.AlbumApi
import com.album.demo.modules.album.infra.remote.AlbumRemoteDS
import com.album.demo.modules.album.infra.remote.model.AlbumResponse
import com.google.gson.*
import com.google.gson.reflect.TypeToken
import io.reactivex.Observable
import io.reactivex.android.plugins.RxAndroidPlugins
import io.reactivex.observers.TestObserver
import io.reactivex.plugins.RxJavaPlugins
import io.reactivex.schedulers.TestScheduler
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations
import org.mockito.runners.MockitoJUnitRunner
import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader
import java.lang.reflect.Type
import java.util.stream.Collectors


/**
 * Class responsible for testing the method for [AlbumRemoteDS] and implementation of [AlbumDataSourceContract]
 */
@RunWith(MockitoJUnitRunner::class)
class AlbumRemoteDSTest {
    @Mock
    private val api: AlbumApi? = null
    private lateinit var albumDataSourceContract: AlbumDataSourceContract

    private var testObserver = TestObserver.create<List<Album>>()

    private var apiResponseType = object : TypeToken<List<Album>>() {}.type
    private var gson = GsonBuilder().setLenient().registerTypeAdapter(apiResponseType, APIResponseSerializer()).create()
    private lateinit var apiResponseList: List<AlbumResponse>
    private var testScheduler = TestScheduler()

    @Before
    fun setUp() {
        setupRXScheduler()
        MockitoAnnotations.initMocks(this)
        albumDataSourceContract = AlbumRemoteDS(api!!)

        apiResponseList = gson.fromJson<List<AlbumResponse>>(
            convertInputStreamToString(this.javaClass.classLoader!!.getResourceAsStream("album_response.json")),
            apiResponseType
        )
    }

    private fun setupRXScheduler() {
        RxJavaPlugins.setIoSchedulerHandler { testScheduler }
        RxAndroidPlugins.setInitMainThreadSchedulerHandler { testScheduler }
    }

    private fun convertInputStreamToString(inputStream: InputStream): String {
        return BufferedReader(InputStreamReader(inputStream)).lines()
            .parallel().collect(Collectors.joining("\n"))
    }

    @Test
    fun getAlbumList_from_API_Response_Test() {
        // Given
        `when`(api?.fetchAlbums()).thenReturn(Observable.just(apiResponseList))

        // When
        albumDataSourceContract.getAlbums().subscribe(testObserver)
        testScheduler.triggerActions();

        // Then
        verify(api, times(1))?.fetchAlbums()
        testObserver.assertValue {
            it.size == 100
            it[0].id == apiResponseList[0].id.toInt()
            it[0].userId == apiResponseList[0].userId
            it[0].title == apiResponseList[0].title
        }
    }
}


class APIResponseSerializer : JsonDeserializer<List<AlbumResponse>> {
    override fun deserialize(
        json: JsonElement?,
        typeOfT: Type,
        context: JsonDeserializationContext
    ): List<AlbumResponse> {
        if (json == null) throw JsonParseException("Unexpected JSON type: ")

        val list = arrayListOf<AlbumResponse>()

        json.apply {
            if (isJsonArray) {
                for (e in asJsonArray) {
                    list.add(context.deserialize<AlbumResponse>(e, AlbumResponse::class.java))
                }
            } else if (isJsonObject) {
                list.add(context.deserialize<AlbumResponse>(json, AlbumResponse::class.java))
            }
        }

        return list
    }
}

