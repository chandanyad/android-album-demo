package com.album.demo

import com.album.demo.exceptions.APIException
import com.album.demo.exceptions.NoDataFoundException
import com.album.demo.modules.album.domain.AlbumService
import com.album.demo.modules.album.domain.AlbumServiceContract
import com.album.demo.modules.album.domain.models.Album
import com.album.demo.modules.album.domain.repo.AlbumRepoContract
import com.album.demo.modules.album.infra.AlbumDataSourceContract
import com.album.demo.modules.album.infra.AlbumRepo
import io.reactivex.Observable
import io.reactivex.observers.TestObserver
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations
import org.mockito.runners.MockitoJUnitRunner

/**
 * Class responsible for testing the method for [AlbumRepo] and implementation of [AlbumRepoContract]
 */
@RunWith(MockitoJUnitRunner::class)
class AlbumRepoTest {
    @Mock
    private val localDataSourceContract: AlbumDataSourceContract? = null

    @Mock
    private val remoteDataSourceContract: AlbumDataSourceContract? = null

    private lateinit var albumRepoContract: AlbumRepoContract
    private var testObserver = TestObserver.create<List<Album>>()
    private val albumList = mutableListOf<Album>()
    private val firstAlbum = Album("11", 1, "Test Title")
    private val secondAlbum = Album("22", 2, "MyWorld")

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        albumRepoContract = AlbumRepo(localDataSourceContract!!, remoteDataSourceContract!!)

        albumList.add(firstAlbum)
        albumList.add(secondAlbum)
    }

    @Test
    fun getAlbumList_from_local_DS_Test() {
        // Given
        `when`(localDataSourceContract?.getAlbums()).thenReturn(Observable.just(albumList))

        // When
        albumRepoContract.getAlbums().subscribe(testObserver)

        // Then
        verify(localDataSourceContract, times(1))?.getAlbums()
        verify(remoteDataSourceContract, times(0))?.getAlbums()
        testObserver.assertValue {
            it.size == 2
            it[0] == (firstAlbum)
            it[1] == (secondAlbum)
        }
    }

    @Test
    fun getAlbumList_local_DS_Empty_Response_And_Remote_DS_Valid_Response_Test() {
        // Given
        `when`(localDataSourceContract?.getAlbums()).thenReturn(Observable.just(emptyList()))
        `when`(remoteDataSourceContract?.getAlbums()).thenReturn(Observable.just(albumList))

        // When
        albumRepoContract.getAlbums().subscribe(testObserver)

        // Then
        verify(localDataSourceContract, times(1))?.getAlbums()
        verify(remoteDataSourceContract, times(1))?.getAlbums()
        testObserver.assertValue {
            it.size == 2
            it[0] == (firstAlbum)
            it[1] == (secondAlbum)
        }
    }

    @Test
    fun getAlbumList_Both_local_And_Remote_DS_Throw_Exception_Test() {
        // Given
        `when`(localDataSourceContract?.getAlbums()).thenReturn(Observable.error(NoDataFoundException()))
        `when`(remoteDataSourceContract?.getAlbums()).thenReturn(Observable.error(APIException()))

        // When
        albumRepoContract.getAlbums().subscribe(testObserver)

        // Then
        verify(localDataSourceContract, times(1))?.getAlbums()
        verify(remoteDataSourceContract, times(1))?.getAlbums()
        testObserver.assertError(NoDataFoundException::class.java)
    }

    @Test
    fun getAlbumList_Both_local_And_Remote_DS_Empty_Response_Test() {
        // Given
        `when`(localDataSourceContract?.getAlbums()).thenReturn(Observable.just(emptyList()))
        `when`(remoteDataSourceContract?.getAlbums()).thenReturn(Observable.just(emptyList()))

        // When
        albumRepoContract.getAlbums().subscribe(testObserver)

        // Then
        verify(localDataSourceContract, times(1))?.getAlbums()
        verify(remoteDataSourceContract, times(1))?.getAlbums()
        testObserver.assertError(NoDataFoundException::class.java)
    }

}
