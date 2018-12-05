package nav.com.mvptut.di.component

import android.app.Application
import android.content.Context
import dagger.Component
import nav.com.mvptut.MvpApp
import nav.com.mvptut.model.SharedPrefsHelper
import nav.com.mvptut.model.DataManager
import nav.com.mvptut.di.ApplicationContext
import nav.com.mvptut.di.module.ApplicationModule
import javax.inject.Singleton


@Singleton
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent {

    @get:ApplicationContext
    val context: Context

    val application: Application

    val dataManager: DataManager

    val preferenceHelper: SharedPrefsHelper

    fun inject(application: MvpApp)

}