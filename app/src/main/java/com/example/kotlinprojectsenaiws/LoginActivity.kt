package com.example.kotlinprojectsenaiws

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContentView(R.layout.activity_main)

        val edEmail = findViewById<EditText>(R.id.email)
        val edSenha = findViewById<EditText>(R.id.senha)
        val btnEntrar = findViewById<Button>(R.id.botaoEntrar)
        val btnCadastrar = findViewById<Button>(R.id.botaoCadastrar)

        btnEntrar.setOnClickListener {
            val email = edEmail.text.toString()
            val senha = edSenha.text.toString()

            if (email == "admin" && senha == "123") {
                Toast.makeText(this, "Login bem-sucedido", Toast.LENGTH_SHORT).show()

                val intent = Intent(this, PrincipalActivity::class.java)
                startActivity(intent)

                finish()
            } else {
                Toast.makeText(this, "Usuário/Senha invalidos ", Toast.LENGTH_SHORT).show()
            }

        }



    }
}