package com.example.huytoapp.dp.ButtonHuyet

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class ButtonHuyet(
    val tenHuyet: String
) : Serializable {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}

