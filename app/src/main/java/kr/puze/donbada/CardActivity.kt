package kr.puze.donbada

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_card.*
import org.jetbrains.anko.startActivity

class CardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        getSupportActionBar()!!.hide()

        button_regist.setOnClickListener {
            startActivity<MainActivity>()
            finish()
        }
    }
}
