package nav.com.mvptut.presenter

import nav.com.mvptut.view.LoginView

interface LoginMvpPresenter<V : LoginView> : MvpPresenter<V> {

    fun startLogin(emailId: String)

}