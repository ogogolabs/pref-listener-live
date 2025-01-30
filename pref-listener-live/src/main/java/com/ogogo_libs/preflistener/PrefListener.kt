package com.ogogo_libs.preflistener

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences


object PrefListener {

    fun init(
        ctx: Context
    ) {

    }

    fun addSharedPreferencesSource(fileName: String) {
        // not need implementation in release
    }

    fun addDatastoreSource(dataStoreAliasName: String, dataStore: DataStore<Preferences>) {
        // not need implementation in release
    }

    fun connectFromReceiver(stringExtra: String, stringExtra1: String? = "") {
        // not need implementation in release
    }
}
