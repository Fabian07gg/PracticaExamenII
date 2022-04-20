package com.example.practicaexamenii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practicaexamenii.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            val pase_vista1 = Intent(this, InfoClinica::class.java)
            startActivity(pase_vista1)
        }

        binding.button2.setOnClickListener{
            val pase_vista1 = Intent(this, InicioTareas::class.java)
            startActivity(pase_vista1)
        }

        binding.button3.setOnClickListener{
            val pase_vista1 = Intent(this, InicioSesion::class.java)
            startActivity(pase_vista1)
        }
    }
}