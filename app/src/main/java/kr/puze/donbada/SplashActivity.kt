package kr.puze.donbada

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.Window.FEATURE_NO_TITLE



class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        //전체화면 만들기

        setContentView(R.layout.activity_splash)


        val hd = Handler()
        hd.postDelayed(Runnable {
            val loginIntent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(loginIntent)
            finish()       // 2 초후 이미지를 닫아버림
        }, 2000)

    }
}
