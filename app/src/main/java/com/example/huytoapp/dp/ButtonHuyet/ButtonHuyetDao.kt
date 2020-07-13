package com.example.huytoapp.dp.ButtonHuyet

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface ButtonHuyetDao {
    @Insert
    suspend fun addButtonHuyet(listButtonHuyet: ButtonHuyet)

    @Query("SELECT * FROM buttonhuyet ORDER BY id DESC")
    suspend fun getAllButtonHuyet() : List<ButtonHuyet>

    @Insert
    suspend fun addMultipleButtonHuyets(vararg listButtonHuyet: ButtonHuyet)

//    @Update
//    suspend fun updateButtonHuyet(huyet: Huyet)

    @Delete
    suspend fun deleteButtonHuyet(listDataHuyet: ButtonHuyet)
}