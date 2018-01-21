package kr.puze.donbada

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_card.*
import org.jetbrains.anko.startActivity

class CardActivity : AppCompatActivity() {

    lateinit var cardNum: String
    lateinit var cardDate: String
    lateinit var cardPassword: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        getSupportActionBar()!!.hide()

        button_regist.setOnClickListener {
            cardNum = account_one.text.toString() + "-" + account_two.text.toString() + "-" + account_three.text.toString() + "-" + account_four.text.toString()
            cardDate = "20"+year.text.toString() + month.text.toString()
            cardPassword = password_one.text.toString() + password_two.text.toString()
            startActivity<MainActivity>()
            finish()
        }
    }
}
