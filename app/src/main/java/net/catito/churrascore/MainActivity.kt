package net.catito.churrascore

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFutebol.setOnClickListener() {
            val futebolScore = Intent(this, Futebol::class.java)
            startActivity(futebolScore)
        }

        btnPebolim.setOnClickListener() {
            val pebolimScore = Intent(this, Pebolim::class.java)
            startActivity(pebolimScore)
        }

        btnTruco.setOnClickListener() {
            val trucoScore = Intent(this, Truco::class.java)
            startActivity(trucoScore)
        }

    }
}
