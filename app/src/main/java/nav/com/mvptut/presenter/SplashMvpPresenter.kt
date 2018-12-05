package nav.com.mvptut.presenter

import nav.com.mvptut.view.SplashView

interface SplashMvpPresenter<V : SplashView> : MvpPresenter<V> {

    fun decideNextActivity()

}