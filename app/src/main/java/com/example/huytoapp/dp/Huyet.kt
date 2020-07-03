package com.example.huytoapp.dp

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class Huyet(
    val maBN: String,
    val tenBN: String,
    val gioiTinh: String,
    val tuoi: String,
    val time: String
):Serializable{
    @PrimaryKey(autoGenerate = true)
    var id : Int = 0
}