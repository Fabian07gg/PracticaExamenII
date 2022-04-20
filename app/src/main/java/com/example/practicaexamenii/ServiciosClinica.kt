package com.example.practicaexamenii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practicaexamenii.databinding.ActivityServiciosClinicaBinding

class ServiciosClinica : AppCompatActivity() {
    private lateinit var binding: ActivityServiciosClinicaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityServiciosClinicaBinding.inflate(layoutInflater)
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

        binding.btnCitas.setOnClickListener {

            binding.infoServicios.setText("Citas en linea \n" +
                    "Pruebas Covid-19 \n"+
            "Financiamiento de cirugías y procedimientos \n")
        }

        binding.btnCoti.setOnClickListener {
            binding.infoServicios.setText("En su afán de ofrecer las mejores prestaciones a los clientes mediante un equipo médico y tecnología de la más alta calidad, el Hospital Clínica Bíblica pone a su disposición el siguiente sistema de cotizaciones. Simplemente llené el siguiente" +
                    " formulario según sus necesidades y nuestro personal de atención al cliente se pondrá en contacto con usted a la brevedad posible.")
        }

        binding.btnSoli.setOnClickListener {
            binding.infoServicios.setText("Una epicrisis es un resumen clínico de un internamiento o consulta externa del paciente. " +
                    "Este resumen brinda información acerca del proceso de hospitalización desde el inicio de la enfermedad hasta su resolución.")
        }

        binding.btnFarmacia.setOnClickListener {
            binding.infoServicios.setText("Ingrese a nuestra farmacia en línea https://alivioexpress.com/inicio/esp/")
        }
    }
}