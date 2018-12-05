package nav.com.mvptut.view

import android.content.Context
import android.os.Bundle
import android.content.Intent
import android.support.annotation.Nullable
import nav.com.mvptut.MvpApp
import nav.com.mvptut.R
import nav.com.mvptut.presenter.SplashPresenter


class SplashActivity : BaseActivity(), SplashView {

    override fun openMainActivity() {
//        val intent = MainActivity.getStartIntent(this)
//        startActivity(intent)
//        finish()
    }

    override fun openLoginActivity() {
//        val intent = MainActivity.getStartIntent(this)
//        startActivity(intent)
//        finish()
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