package nav.com.mvptut

import android.app.Application
import nav.com.mvptut.model.DataManager
import nav.com.mvptut.model.SharedPrefsHelper


class MvpApp : Application() {

    lateinit var dataManager: DataManager
    override fun onCreate() {
        super.onCreate()
        dataManager = DataManager(SharedPrefsHelper(applicationContext))
    }


}