package com.example.logonrm.configuracaopersonagem

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btCriar.setOnClickListener{

            Toast.makeText(
                    this, "Usuario Criado", Toast.LENGTH_SHORT)
                    .show()


        }
    }
}
