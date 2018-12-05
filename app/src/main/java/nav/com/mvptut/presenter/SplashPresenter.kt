package nav.com.mvptut.presenter

import nav.com.mvptut.model.DataManager
import nav.com.mvptut.view.SplashView


class SplashPresenter<V : SplashView>(dataManager: DataManager) : BasePresenter<V>(dataManager), SplashMvpPresenter<V> {

    override fun decideNextActivity() {
        if (dataManager.loggedInMode!!) {
            mvpView!!.openMainActivity()
        } else {
            mvpView!!.openLoginActivity()
        }
    }
}