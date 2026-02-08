package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityContactoBinding

class ContactoActivity : AppCompatActivity() {

    private lateinit var binding: ActivityContactoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // REQUISITO: Inflate
        binding = ActivityContactoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnEnviar.setOnClickListener {
            val nombre = binding.etNombre.text.toString()
            val email = binding.etEmail.text.toString()
            val mensaje = binding.etMensaje.text.toString()

            // Crear intent solo para transportar datos de vuelta
            val resultIntent = Intent()
            val textoCompleto = "$nombre ($email): $mensaje"

            resultIntent.putExtra("EXTRA_MENSAJE_CONTACTO", textoCompleto)

            // Configurar el resultado como OK
            setResult(RESULT_OK, resultIntent)

            // Cerrar la actividad para volver atrás
            finish()
        }
    }
}