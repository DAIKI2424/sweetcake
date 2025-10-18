package com.example.sweetcake.activitys

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sweetcake.R

// 1. Asegúrate de que ambas Activities están importadas
import com.example.sweetcake.activitys.loginactivity


class Bienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // 2. Confirma que este es el nombre correcto de tu archivo XML en res/layout
        setContentView(R.layout.activity_bienvenida2)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // --- NAVEGACIÓN A LOGIN ---
        // 3. Busca el botón con el ID "btn_login_bn" que debe estar en tu XML
        val botonIniciarSesion = findViewById<Button>(R.id.btn_login_bn)
        botonIniciarSesion.setOnClickListener {
            val intent = Intent(this, loginactivity::class.java)
            startActivity(intent)
        }

        // --- NAVEGACIÓN A REGISTRO ---
        // 4. Busca el botón con el ID "btn_registro_bn"
        val botonRegistro = findViewById<Button>(R.id.btn_registro_bn)
        botonRegistro.setOnClickListener {
            // Se usa el nombre de clase correcto: "registro_Activity"
            val intent = Intent(this, activity_registro::class.java)
            startActivity(intent)
        }
    }
}


