package com.example.kotlinprojectsenaiws

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val peso = findViewById<TextView>(R.id.editTextNumberDecimal2)
        val altura = findViewById<TextView>(R.id.editTextNumberDecimal2)

        fun calcularIMC(peso: Double, altura: Double): Double {
            require(altura > 0.0) { "A altura deve ser maior que zero." }
            require(peso > 0.0) { "O peso deve ser maior que zero." }

            // Fórmula: IMC = peso / altura²
            return peso / (altura * altura)
        }
    }
}