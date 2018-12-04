package nav.com.mvptut.presenter

import nav.com.mvptut.model.DataManager
import nav.com.mvptut.view.MvpView


class BasePresenter<V : MvpView>(dataManager: DataManager) : MvpPresenter<V> {

    var mvpView: V? = null
        private set

    var dataManager: DataManager
        internal set


    init {
        this.dataManager = dataManager
    }

    override fun onAttach(mvpView: V) {
        this.mvpView = mvpView
    }
}