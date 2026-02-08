package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivityLocalizacionBinding

class LocalizacionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLocalizacionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // REQUISITO: Inflate
        binding = ActivityLocalizacionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Simulación de ubicación
        binding.tvMapa.text = "📍 Ubicación: Ciudad de México, Av. Reforma 222"
        // Opcional: Podrías poner una ImageView con una foto de un mapa aquí
    }
}