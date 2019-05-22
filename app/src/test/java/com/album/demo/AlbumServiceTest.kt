package com.album.demo

import com.album.demo.exceptions.NoDataFoundException
import com.album.demo.modules.album.domain.AlbumService
import com.album.demo.modules.album.domain.AlbumServiceContract
import com.album.demo.modules.album.domain.models.Album
import com.album.demo.modules.album.domain.repo.AlbumRepoContract
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
 * Class responsible for testing the method for [AlbumService] and implementation of [AlbumServiceContract]
 */
@RunWith(MockitoJUnitRunner::class)
class AlbumServiceTest {
    @Mock
    private val repoContract: AlbumRepoContract? = null
    private lateinit var albumServiceContract: AlbumServiceContract
    private var testObserver = TestObserver.create<List<Album>>()

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        albumServiceContract = AlbumService(repoContract!!)

    }

    @Test
    fun getAlbumList_Exception_Test() {
        // Given
        `when`(repoContract?.getAlbums()).thenReturn(Observable.error(NoDataFoundException()))

        // When
        albumServiceContract.getAlbumList().subscribe(testObserver)

        // Then
        verify(repoContract, times(1))?.getAlbums()
        testObserver.assertError(NoDataFoundException::class.java)
    }

    @Test
    fun getAlbumList_empty_list_Test() {
        // Given
        `when`(repoContract?.getAlbums()).thenReturn(Observable.just(emptyList()))

        // When
        albumServiceContract.getAlbumList().subscribe(testObserver)

        // Then
        verify(repoContract, times(1))?.getAlbums()
        testObserver.assertError(NoDataFoundException::class.java)
    }

    @Test
    fun getAlbumList_valid_response_Test() {
        // Given
        val albumList = mutableListOf<Album>()
        val firstAlbum = Album("11", 1, "Test Title")
        albumList.add(firstAlbum)
        val secondAlbum = Album("22", 2, "MyWorld")
        albumList.add(secondAlbum)
        `when`(repoContract?.getAlbums()).thenReturn(Observable.just(albumList))

        // When
        albumServiceContract.getAlbumList().subscribe(testObserver)

        // Then
        verify(repoContract, times(1))?.getAlbums()
        testObserver.assertValue {
            it.size == 2
            it[0] == (firstAlbum)
            it[1] == (secondAlbum)
        }
    }

}
