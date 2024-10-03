package com.narutin.calculadora.ui.theme

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.narutin.calculadora.R

// ": AppCompctActivity()" herda ou importa as funções de tela do kotlin
class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // seta o conteudo da view como o arquivo layout principal
        setContentView(R.layout.activity_main)

        val btnCalcular: Button = findViewById(R.id.btnCalcular)
        val edtNumero: EditText = findViewById(R.id.edtNumero2)
        btnCalcular.setOnClickListener {
            val text = edtNumero.text
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(this, text, duration) // in Activity
            toast.show() }
    }

    fun eventoClickBotaoCalcular(){

    }
}