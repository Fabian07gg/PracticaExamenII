package com.example.practicaexamenii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practicaexamenii.databinding.ActivityContactoClinicaBinding

class ContactoClinica : AppCompatActivity() {
    private lateinit var binding: ActivityContactoClinicaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactoClinicaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnInicio.setOnClickListener{
            val pase_vista1 = Intent(this, InfoClinica::class.java)
            startActivity(pase_vista1)
        }

        binding.btnContacto.setOnClickListener{
            val pase_vista1 = Intent(this, ContactoClinica::class.java)
            startActivity(pase_vista1)
        }

        binding.btnServicios.setOnClickListener{
            val pase_vista1 = Intent(this, ServiciosClinica::class.java)
            startActivity(pase_vista1)
        }
    }
}