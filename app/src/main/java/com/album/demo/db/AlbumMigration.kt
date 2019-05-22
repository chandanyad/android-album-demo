package com.album.demo.db

import io.realm.DynamicRealm
import io.realm.RealmMigration

/**
 * Realm migration class, required in case of any change in schema
 */
class AlbumMigration : RealmMigration {
    override fun migrate(realm: DynamicRealm, oldVersion: Long, newVersion: Long) {
        if (oldVersion == 1L) {
            realm.schema.get("")?.let {
                // Do the schema change here
            }
        }
    }
}