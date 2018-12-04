package nav.com.mvptut.model

import android.R.id.edit
import android.content.Context
import android.text.method.TextKeyListener.clear
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences


class SharedPrefsHelper(context: Context) {

    internal var mSharedPreferences: SharedPreferences

    val email: String?
        get() = mSharedPreferences.getString(EMAIL, null)

    var loggedInMode: Boolean
        get() = mSharedPreferences.getBoolean("IS_LOGGED_IN", false)
        set(loggedIn) = mSharedPreferences.edit().putBoolean("IS_LOGGED_IN", loggedIn).apply()

    init {
        mSharedPreferences = context.getSharedPreferences(MY_PREFS, MODE_PRIVATE)
    }

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