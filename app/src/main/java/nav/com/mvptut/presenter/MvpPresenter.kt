package nav.com.mvptut.presenter

import nav.com.mvptut.view.MvpView


interface MvpPresenter<V : MvpView> {

    fun onAttach(mvpView: V)

}