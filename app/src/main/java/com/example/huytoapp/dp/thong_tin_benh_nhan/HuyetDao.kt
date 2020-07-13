package com.example.huytoapp.dp.thong_tin_benh_nhan

import androidx.room.*
import com.example.huytoapp.dp.thong_tin_benh_nhan.Huyet

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

