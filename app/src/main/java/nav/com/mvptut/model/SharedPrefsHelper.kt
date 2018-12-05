package nav.com.mvptut.model

import android.R.id.edit
import android.content.Context
import android.text.method.TextKeyListener.clear
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences
import nav.com.mvptut.di.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class SharedPrefsHelper @Inject constructor(@ApplicationContext val context: Context) {

    @Inject
    lateinit var mSharedPreferences: SharedPreferences

    val email: String?
        get() = mSharedPreferences.getString(EMAIL, null)

    var loggedInMode: Boolean
        get() = mSharedPreferences.getBoolean("IS_LOGGED_IN", false)
        set(loggedIn) = mSharedPreferences.edit().putBoolean("IS_LOGGED_IN", loggedIn).apply()

    fun clear() {
        mSharedPreferences.edit().clear().apply()
    }

    fun putEmail(email: String) {
        mSharedPreferences.edit().putString(EMAIL, email).apply()
    }

    companion object {

        val MY_PREFS = "MY_PREFS"

        val EMAIL = "EMAIL"
    }

}