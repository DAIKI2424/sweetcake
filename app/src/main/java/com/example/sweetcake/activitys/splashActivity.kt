package com.example.sweetcake.activitys

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.sweetcake.R

class splashActivity : AppCompatActivity() {

    private val splash_duration: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)

        // Handler para navegar a la siguiente pantalla después de 3 segundos
        Handler(Looper.getMainLooper()).postDelayed({

            // Creamos la intención de ir a la pantalla de Bienvenida
            val intent = Intent(this, Bienvenida::class.java)

            // 1. INICIAMOS LA NUEVA ACTIVIDAD (LÍNEA CORREGIDA)
            startActivity(intent)

            // 2. Cerramos la splashActivity para que el usuario no pueda volver a ella
            finish()

        }, splash_duration)
    }
}





