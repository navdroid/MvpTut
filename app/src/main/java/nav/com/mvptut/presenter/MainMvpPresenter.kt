package nav.com.mvptut.presenter

import nav.com.mvptut.view.MainView
import nav.com.mvptut.view.MvpView

interface MainMvpPresenter<V : MainView> : MvpPresenter<V> {

    fun getEmailId(): String
    fun setUserLoggedOut()

}