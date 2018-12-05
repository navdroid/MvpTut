package nav.com.mvptut.presenter

import nav.com.mvptut.model.DataManager
import nav.com.mvptut.view.LoginView

class LoginPresenter<V : LoginView>(dataManager: DataManager) : BasePresenter<V>(dataManager), LoginMvpPresenter<V> {

    override fun startLogin(emailId: String) {
        dataManager.saveEmailId(emailId)
        dataManager.setLoggedIn()
        mvpView?.openMainActivity()
    }


}