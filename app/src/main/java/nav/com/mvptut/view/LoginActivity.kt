package nav.com.mvptut.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import nav.com.mvptut.R
import kotlinx.android.synthetic.main.activity_login.*
import nav.com.mvptut.presenter.LoginPresenter
import nav.com.mvptut.MvpApp
import nav.com.mvptut.model.DataManager
import android.widget.Toast
import nav.com.mvptut.CommonUtils
import android.content.Intent


class LoginActivity : BaseActivity(), LoginView {

    var loginPresenter: LoginPresenter<LoginView>? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val dataManager = (application as MvpApp).dataManager
        loginPresenter = LoginPresenter<LoginView>(dataManager)

        loginPresenter?.onAttach(this)
        email_sign_in_button.setOnClickListener {
            onLoginButtonClick()
        }
    }

    override fun openMainActivity() {

//        val intent = MainActivity.getStartIntent(this)
//        startActivity(intent)
//        finish()
        Toast.makeText(this, "LoggedIn", Toast.LENGTH_SHORT).show()

    }

    override fun onLoginButtonClick() {
        val emailId = email.text.toString()
        val password = password.text.toString()

        if (!CommonUtils.isEmailValid(emailId)) {
            Toast.makeText(this, "Enter correct Email", Toast.LENGTH_LONG).show()
            return
        }

        if (password.isEmpty()) {
            Toast.makeText(this, "Enter Password", Toast.LENGTH_LONG).show()
            return
        }

        loginPresenter?.startLogin(emailId)
    }


}
