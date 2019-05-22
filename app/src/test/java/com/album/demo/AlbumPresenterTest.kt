package com.album.demo

import com.album.demo.exceptions.NoDataFoundException
import com.album.demo.modules.album.domain.AlbumServiceContract
import com.album.demo.modules.album.domain.models.Album
import com.album.demo.modules.album.ui.AlbumContracts
import com.album.demo.modules.album.ui.AlbumPresenter
import com.album.demo.modules.album.ui.AlbumViewModel
import io.reactivex.Observable
import io.reactivex.observers.TestObserver
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentCaptor
import org.mockito.Captor
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations
import org.mockito.runners.MockitoJUnitRunner

/**
 * Class responsible for testing the method for [AlbumPresenter] and implementation of [AlbumContracts.Presenter]
 */
@RunWith(MockitoJUnitRunner::class)
class AlbumPresenterTest {
    @Mock
    private val view: AlbumContracts.View? = null
    @Mock
    private val albumServiceContract: AlbumServiceContract? = null

    private lateinit var presenter: AlbumContracts.Presenter
    private var testObserver = TestObserver.create<List<Album>>()
    @Captor
    private lateinit var captor: ArgumentCaptor<AlbumViewModel>

    @Before
    fun setUp() {
        MockitoAnnotations.initMocks(this)
        presenter = AlbumPresenter(view!!, albumServiceContract!!)
    }

    @Test
    fun getAlbums_Exception_Test() {
        // Given
        `when`(albumServiceContract?.getAlbumList()).thenReturn(Observable.error(NoDataFoundException()))

        // When
        presenter.getAlbums()

        // Then
        verify(albumServiceContract, times(1))?.getAlbumList()
        verify(view, times(1))?.onError()
    }

    @Test
    fun getAlbums_empty_list_Test() {
        // Given
        `when`(albumServiceContract?.getAlbumList()).thenReturn(Observable.just(emptyList()))

        // When
        presenter.getAlbums()

        // Then
        verify(albumServiceContract, times(1))?.getAlbumList()
        verify(view, times(1))?.onError()
    }

    @Test
    fun getAlbums_valid_response_Test() {
        // Given
        val albumList = mutableListOf<Album>()
        val firstAlbum = Album("11", 1, "Test Title")
        albumList.add(firstAlbum)
        val secondAlbum = Album("22", 2, "MyWorld")
        albumList.add(secondAlbum)
        `when`(albumServiceContract?.getAlbumList()).thenReturn(Observable.just(albumList))

        // When
        presenter.getAlbums()

        // Then
        verify(albumServiceContract, times(1))?.getAlbumList()
       /* verify(view!!, times(1)).updateAlbumList(captor.capture())
        captor.value.apply {
            assertEquals(albumList.size, 2)
            assertEquals(albumList[0], firstAlbum)
            assertEquals(albumList[1], secondAlbum)
        }*/
    }

}
