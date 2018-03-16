package com.example.logonrm.configuracaopersonagem

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    fun trocaImagem (idImagem: Int) {
        ivClasse.setImageDrawable(
                ContextCompat.getDrawable(this, idImagem))

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sbForca.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {

            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {

            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {

            }


        })



        spClasse.onItemSelectedListener = (object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {

            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val tipoPersonagem = TipoPersonagemEnum.from(position)

                when (tipoPersonagem){

                    TipoPersonagemEnum.MAGO -> trocaImagem (R.drawable.mago)
                    TipoPersonagemEnum.MUSICO -> trocaImagem (R.drawable.musico)
                    TipoPersonagemEnum.PINTOR -> trocaImagem (R.drawable.pintor)
                    TipoPersonagemEnum.POETA -> trocaImagem (R.drawable.poeta)
                    TipoPersonagemEnum.BAILARINO -> trocaImagem (R.drawable.bailarino)

                }
            }
        })




        spClasse.setOnItemClickListener{parent, view, position, id ->

        }



        btCriar.setOnClickListener{

            Toast.makeText(
                    this, "Usuario Criado", Toast.LENGTH_SHORT)
                    .show()


        }
    }
}
