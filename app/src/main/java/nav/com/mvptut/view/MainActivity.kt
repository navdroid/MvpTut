package nav.com.mvptut.view

import android.content.Context
import android.widget.TextView
import nav.com.mvptut.presenter.MainPresenter
import nav.com.mvptut.MvpApp
import android.os.Bundle
import android.content.Intent
import android.support.annotation.Nullable
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import nav.com.mvptut.R


class MainActivity : BaseActivity(), MainView {

    private lateinit var mainPresenter: MainPresenter<MainView>
    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataManager = (application as MvpApp).dataManager
        mainPresenter = MainPresenter(dataManager)
        mainPresenter.onAttach(this)

        logoutButton.setOnClickListener {
            mainPresenter.setUserLoggedOut()
        }
    }

    override fun openSplashScreen() {
        val intent = Intent(this@MainActivity, SplashActivity::class.java)
        startActivity(intent)
        finish()
    }
}