package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityInicioBinding

class InicioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInicioBinding

    // Preparar el launcher para recibir datos de Activity 3 (Contacto)
    private val respuestaContacto = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == RESULT_OK) {
            val data = result.data
            val mensajeRecibido = data?.getStringExtra("EXTRA_MENSAJE_CONTACTO")
            // Mostrar en el TextView adicional
            binding.tvDatosContacto.text = "Mensaje recibido: $mensajeRecibido"
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 1. REQUISITO: Usar inflate
        binding = ActivityInicioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 2. Recibir nombre de usuario de Activity 1
        val usuario = intent.getStringExtra("EXTRA_USUARIO")
        binding.tvBienvenida.text = "Bienvenido, $usuario"

        // 3. Navegación a las otras actividades

        // A Contacto (Esperando respuesta)
        binding.btnContacto.setOnClickListener {
            val intent = Intent(this, ContactoActivity::class.java)
            respuestaContacto.launch(intent)
        }

        // A Sobre Nosotros
        binding.btnSobreNosotros.setOnClickListener {
            startActivity(Intent(this, SobreNosotrosActivity::class.java))
        }

        // A Localización
        binding.btnLocalizacion.setOnClickListener {
            startActivity(Intent(this, LocalizacionActivity::class.java))
        }
    }
}