package net.catito.churrascore

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_futebol.*

class Futebol : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {

    private var seekbarView: SeekBar? = null
    private var tempoRestanteView: TextView? = null
    private var minutos: Int = 0
    private var segundos: Int = 0
    private var contarTempo: Boolean = false
    private var progressAtual: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_futebol)

        seekbarView = this.seekTimer
        tempoRestanteView = this.tempoRestante
        seekbarView!!.setOnSeekBarChangeListener(this)

        play.setOnClickListener() {
            contarTempo = true
            Toast.makeText(this, "Vaaaaalendo!", Toast.LENGTH_SHORT).show()
            while(contarTempo){
                progressAtual = seekbarView!!.progress
                if(progressAtual > 0) {
                    seekbarView!!.progress = progressAtual - 1
                    minutos = seekbarView!!.progress / 60
                    segundos = seekbarView!!.progress % 60
                    tempoRestanteView!!.text = String.format("%02d:%02d", minutos, segundos)
                } else {
                    contarTempo = false
                    Toast.makeText(this, "Acabou o tempo!", Toast.LENGTH_SHORT).show()
                }
            }
        }

        pause.setOnClickListener(){
            contarTempo = false
            Toast.makeText(this, "Pausa pra cerveja!", Toast.LENGTH_SHORT).show()
        }

    }


    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        minutos = progress / 60
        segundos = progress % 60
        tempoRestanteView!!.text = String.format("%02d:%02d", minutos, segundos)
    }

    override fun onStartTrackingTouch(seekBar: SeekBar?) {
        Toast.makeText(this, "Mudando tempo!", Toast.LENGTH_SHORT).show()
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
        Toast.makeText(this, "Mudando tempo!", Toast.LENGTH_SHORT).show()
    }
}