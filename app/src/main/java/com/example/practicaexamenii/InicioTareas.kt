package com.example.practicaexamenii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class InicioTareas : AppCompatActivity() {
    private lateinit var database: myDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_tareas)
        database = Room.databaseBuilder(
            applicationContext, myDatabase::class.java, "Tareas_Practica"
        ).build()
        GlobalScope.launch {
            DataObject.listdata = database.dao().getTasks() as MutableList<InfoTareas>
        }
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, Tareas::class.java)
            startActivity(intent)
        }, 2000)
    }
}