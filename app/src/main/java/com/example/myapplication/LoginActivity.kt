package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    // Declaramos el binding
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1. REQUISITO: Usar inflate para cargar el layout
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            val usuario = binding.etUsuario.text.toString()
            val password = binding.etPassword.text.toString()

            if (usuario.isNotEmpty() && password.isNotEmpty()) {
                // Navegar a Activity 2
                val intent = Intent(this, InicioActivity::class.java)
                // Pasar el valor del usuario
                intent.putExtra("EXTRA_USUARIO", usuario)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Por favor llena los campos", Toast.LENGTH_SHORT).show()
            }
        }
    }
}