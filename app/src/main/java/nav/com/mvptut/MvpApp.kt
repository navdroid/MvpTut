package nav.com.mvptut

import android.app.Application
import nav.com.mvptut.model.DataManager
import nav.com.mvptut.model.SharedPrefsHelper
import nav.com.mvptut.di.component.ApplicationComponent
import nav.com.mvptut.di.component.DaggerApplicationComponent
import nav.com.mvptut.di.module.ApplicationModule
import javax.inject.Inject


class MvpApp : Application() {

    protected var applicationComponent: ApplicationComponent? = null
    @Inject
    lateinit var dataManager: DataManager
    override fun onCreate() {
        super.onCreate()
        dataManager = DataManager(SharedPrefsHelper(applicationContext))
        applicationComponent = DaggerApplicationComponent
                .builder()
                .applicationModule( ApplicationModule(this))
                .build();
        applicationComponent?.inject(this);
    }


}