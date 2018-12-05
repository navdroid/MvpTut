package nav.com.mvptut.model

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataManager @Inject constructor(var mSharedPrefsHelper: SharedPrefsHelper) {

    val emailId: String?
        get() = mSharedPrefsHelper.email

    val loggedInMode: Boolean?
        get() = mSharedPrefsHelper.loggedInMode

    fun clear() {
        mSharedPrefsHelper.clear()
    }

    fun saveEmailId(email: String) {
        mSharedPrefsHelper.putEmail(email)
    }

    fun setLoggedIn() {
        mSharedPrefsHelper.loggedInMode = true
    }
}
