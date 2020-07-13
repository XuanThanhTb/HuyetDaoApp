package com.example.huytoapp.dp.thong_tin_benh_nhan

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.huytoapp.dp.ButtonHuyet.ButtonHuyet
import java.io.Serializable

@Entity
data class Huyet(
    val maBN: String,
    val tenBN: String,
    val gioiTinh: String,
    val tuoi: String,
    val time: String
//    ,
//    val listDataHuyet: List<ListButtonHuyet>
) : Serializable {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}


