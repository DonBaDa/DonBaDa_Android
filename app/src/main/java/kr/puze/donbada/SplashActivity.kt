package kr.puze.donbada
import android.app.ProgressDialog
import android.content.pm.PackageManager
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.LinearLayout
import android.widget.RelativeLayout
import kotlinx.android.synthetic.main.activity_splash.*
import org.jetbrains.anko.startActivity
import android.content.Intent
import android.os.Handler
import android.widget.Toast


class SplashActivity : AppCompatActivity() {

    lateinit var anim: Animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        getSupportActionBar()!!.hide()
        permisionCheck()

        initApp()
        login_layout.setOnClickListener {
            lateinit var progressDialog: ProgressDialog
            progressDialog = ProgressDialog(this@SplashActivity)
            progressDialog.setMessage("로그인 중 . . .")
            progressDialog.show()
            val hd = Handler()
            hd.postDelayed(Runnable {
                val loginIntent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(loginIntent)
                finish()       // 2 초후 이미지를 닫아버림
            }, 3000)
            progressDialog.dismiss()
            Toast.makeText(this@SplashActivity, "로그인 완료 . . .", Toast.LENGTH_LONG).show()
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

    fun permisionCheck() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.INTERNET) != PackageManager.PERMISSION_GRANTED) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    Log.d("puze", "PERMISSION")
                    requestPermissions(arrayOf<String>(android.Manifest.permission.INTERNET,
                            android.Manifest.permission.BLUETOOTH,
                            android.Manifest.permission.BLUETOOTH_ADMIN),
                            200)
                    Log.d("puze", "initApp0")
                    initApp()
                }
            } else {
                Log.d("puze", "initApp1")
                initApp()
            }
            initApp()
        } else {
            Log.d("puze", "initApp2")
            initApp()
        }
    }
}
