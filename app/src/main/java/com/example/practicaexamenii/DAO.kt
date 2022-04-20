package com.example.practicaexamenii

import androidx.room.*
import androidx.room.Entity

@Dao
interface DAO {
    @Insert
    suspend fun insertTask(entity: com.example.practicaexamenii.Entity)

    @Update
    suspend fun updateTask(entity: com.example.practicaexamenii.Entity)

    @Delete
    suspend fun deleteTask(entity: com.example.practicaexamenii.Entity)

    @Query("Delete from tareas_practica")
    suspend fun deleteAll()

    @Query("Select * from tareas_practica")
    suspend fun getTasks():List<InfoTareas>

}