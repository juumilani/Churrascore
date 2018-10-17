package net.catito.churrascore

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_splash_screen_acitivity.*

class SplashScreenAcitivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen_acitivity)

        GlideApp.with(this)
                .load("https://d2gg9evh47fn9z.cloudfront.net/800px_COLOURBOX21948412.jpg")
                .into(imageSpace)
        Handler().postDelayed({
            val main = Intent(this, MainActivity::class.java)
            startActivity(main)
            finish()
        }, 2000)
    }
}
