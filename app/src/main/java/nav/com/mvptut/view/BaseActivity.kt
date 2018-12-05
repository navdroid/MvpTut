package nav.com.mvptut.view

import android.support.v7.app.AppCompatActivity
import nav.com.mvptut.MvpApp
import nav.com.mvptut.di.ApplicationContext
import nav.com.mvptut.di.component.ApplicationComponent
import nav.com.mvptut.di.component.DaggerApplicationComponent
import nav.com.mvptut.di.module.ApplicationModule
import nav.com.mvptut.model.DataManager
import javax.inject.Inject


open class BaseActivity : AppCompatActivity(), MvpView{

//    @Inject
//    lateinit var dataManager: DataManager
//    protected var applicationComponent: ApplicationComponent? = null
//
//
//    fun getActivityComponent(): ApplicationComponent? {
//        if (applicationComponent == null) {
//            applicationComponent = DaggerApplicationComponent.builder()
//                    .applicationModule( ApplicationModule(application))
//                    .build();
//        }
//        return applicationComponent
//    }

}