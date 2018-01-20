package kr.puze.donbada

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.view.Window
import android.view.WindowManager
import android.view.Window.FEATURE_NO_TITLE
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.activity_splash.*
import org.jetbrains.anko.startActivity


class SplashActivity : AppCompatActivity() {

    lateinit var anim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        getSupportActionBar()!!.hide()

        initApp()

        login_layout.setOnClickListener {
            startActivity<RegisterActivity>()
            finish()
        }
    }

    fun initApp(): Unit{
        translateAnim()
        alphaAnim()
    }

    fun translateAnim(): Unit {
        val translateAnim: LinearLayout = findViewById(R.id.logo_layout)
        anim = AnimationUtils.loadAnimation(this, R.anim.translate)
        anim.reset()


        translateAnim.clearAnimation()
        translateAnim.startAnimation(anim)

        val thread: Thread = Thread {
            try {
                var term = 0
                while (term < 3000) {
                    Thread.sleep(60)
                    term += 100
                }
//                val loginIntent = Intent(this, LoginActivity::class.java)
//                loginIntent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION
//                startActivity(loginIntent)
//                finish()
            } catch (e: InterruptedException) {
            } finally {
            }
        }
        thread.start()
    }

    fun alphaAnim(): Unit {
        val alphaAnim: RelativeLayout = findViewById(R.id.login_layout)

        anim = AnimationUtils.loadAnimation(this, R.anim.alpha)
        anim.reset()

        alphaAnim.clearAnimation()
        alphaAnim.startAnimation(anim)

        val thread: Thread = Thread {
            try {
                var term = 0
                while (term < 3000) {
                    Thread.sleep(60)
                    term += 100
                }
//                val loginIntent = Intent(this, LoginActivity::class.java)
//                loginIntent.flags = Intent.FLAG_ACTIVITY_NO_ANIMATION
//                startActivity(loginIntent)
//                finish()
            } catch (e: InterruptedException) {
            } finally {
//                this.finish()
            }
        }
        thread.start()
    }
}
