package com.example.practicaexamenii

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_actualizar_tarea.*
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class ActualizarTarea : AppCompatActivity() {
    private lateinit var database: myDatabase
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actualizar_tarea)
        database = Room.databaseBuilder(
            applicationContext, myDatabase::class.java, "Tareas_Practica"
        ).build()
        val pos = intent.getIntExtra("id", -1)
        if (pos != -1) {
            val title = DataObject.getData(pos).title
            val priority = DataObject.getData(pos).priority
            create_title.setText(title)
            create_priority.setText(priority)

            delete_button.setOnClickListener {
                DataObject.deleteData(pos)
                GlobalScope.launch {
                    database.dao().deleteTask(
                        Entity(
                            pos + 1,
                            create_title.text.toString(),
                            create_priority.text.toString()
                        )
                    )
                }
                myIntent()
            }

            update_button.setOnClickListener {
                DataObject.updateData(
                    pos,
                    create_title.text.toString(),
                    create_priority.text.toString()
                )
                GlobalScope.launch {
                    database.dao().updateTask(
                        Entity(
                            pos + 1, create_title.text.toString(),
                            create_priority.text.toString()
                        )
                    )
                }
                myIntent()
            }

        }
    }

    fun myIntent() {
        val intent = Intent(this, Tareas::class.java)
        startActivity(intent)
    }
}