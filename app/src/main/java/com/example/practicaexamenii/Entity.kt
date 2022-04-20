package com.example.practicaexamenii

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Tareas_Practica")
data class Entity(
    @PrimaryKey(autoGenerate = true)
    var id:Int,
    var title:String,
    var priority:String
)