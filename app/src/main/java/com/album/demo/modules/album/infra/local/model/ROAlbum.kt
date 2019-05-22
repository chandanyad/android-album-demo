package com.album.demo.modules.album.infra.local.model

import android.support.annotation.Nullable
import com.album.demo.modules.album.domain.models.Album
import io.realm.RealmModel
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass
import java.util.*

/**
 * Data model representing the Realm object
 */
@RealmClass
open class ROAlbum : RealmModel {
    lateinit var userId: String
    @PrimaryKey
    var id: Int? = null
    lateinit var title: String
    var lastSyncDate: Date = Date()

    constructor() { // Primary constructor required by Realm
    }

    constructor(userId: String, id: Int, title: String) {
        this.userId = userId
        this.id = id
        this.title = title
    }

    public fun convertToDomainModel(): Album {
        return Album(userId, id!!, title)
    }
}