package com.jun.querygithubprofile

/**
 * Created by jungoh on 2017-06-12.
 */
import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        val realmConfig = RealmConfiguration.Builder(
                this).deleteRealmIfMigrationNeeded().build()
        Realm.setDefaultConfiguration(realmConfig)
    }
}