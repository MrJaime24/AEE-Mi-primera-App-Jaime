package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.databinding.ActivitySobreNosotrosBinding

class SobreNosotrosActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySobreNosotrosBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // REQUISITO: Inflate
        binding = ActivitySobreNosotrosBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Aquí solo se muestra información estática definida en el XML
        binding.tvInfo.text = "Aplicación desarrollada por el equipo de Estudiantes v1.0"
    }
}