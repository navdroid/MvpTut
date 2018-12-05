package nav.com.mvptut.di.module

import android.app.Application
import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import dagger.Module
import dagger.Provides
import nav.com.mvptut.di.ApplicationContext
import nav.com.mvptut.model.SharedPrefsHelper


@Module
class ApplicationModule(private val mApplication: Application) {

    @Provides
    @ApplicationContext
    internal fun provideContext(): Context {
        return mApplication
    }

    @Provides
    internal fun provideApplication(): Application {
        return mApplication
    }

    @Provides
    internal fun provideSharedPrefs(): SharedPreferences {
        return mApplication.getSharedPreferences(SharedPrefsHelper.MY_PREFS, MODE_PRIVATE)
    }
}