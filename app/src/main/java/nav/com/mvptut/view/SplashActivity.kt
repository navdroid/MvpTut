package nav.com.mvptut.view

import android.content.Context
import android.os.Bundle
import android.content.Intent
import android.support.annotation.Nullable
import android.widget.Toast
import nav.com.mvptut.MvpApp
import nav.com.mvptut.R
import nav.com.mvptut.presenter.SplashPresenter


class SplashActivity : BaseActivity(), SplashView {

    override fun openMainActivity() {
        startActivity(Intent(this@SplashActivity, MainActivity::class.java))
        finish()
    }

    override fun openLoginActivity() {
        startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
        finish()
    }

    fun getStartIntent(context: Context): Intent {
        return Intent(context, SplashActivity::class.java)
    }

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val dataManager = (application as MvpApp).dataManager

        var mSplashPresenter = SplashPresenter<SplashView>(dataManager)

        mSplashPresenter.onAttach(this)

        mSplashPresenter.decideNextActivity()

    }

}