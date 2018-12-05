package nav.com.mvptut.presenter

import nav.com.mvptut.model.DataManager
import nav.com.mvptut.view.MainView

class MainPresenter<V : MainView>(dataManager: DataManager) : BasePresenter<V>(dataManager), MainMvpPresenter<V> {
    override fun getEmailId(): String = dataManager.emailId ?: ""

    override fun setUserLoggedOut() {
        dataManager.clear()
        mvpView?.openSplashScreen()
    }


}