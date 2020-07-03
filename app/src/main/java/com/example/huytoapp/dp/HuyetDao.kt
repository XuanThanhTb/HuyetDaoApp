package com.example.huytoapp.dp

import androidx.room.*

@Dao
interface HuyetDao {

    @Insert
    suspend fun addHuyet(huyet: Huyet)

    @Query("SELECT * FROM huyet ORDER BY id DESC")
    suspend fun getAllHuyets() : List<Huyet>

    @Insert
    suspend fun addMultipleHuyets(vararg huyet: Huyet)

    @Update
    suspend fun updateHuyet(huyet: Huyet)

    @Delete
    suspend fun deleteHuyet(huyet: Huyet)
}