package kr.puze.donbada

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.startActivity




class RegisterActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        getSupportActionBar()!!.hide()

        inform_name.setText("박태준")
        inform_birth.setText("2000.06.01")
        inform_email.setText("rsef0601@naver.com")
        button_next.setOnClickListener {
            startActivity<CardActivity>()
            finish()
        }
    }
}
