package com.example.huytoapp.dp.thong_tin_benh_nhan

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.huytoapp.dp.ButtonHuyet.ButtonHuyet
import com.example.huytoapp.dp.ButtonHuyet.ButtonHuyetDao

@Database(
    entities = [ButtonHuyet::class],
    version = 1,
    exportSchema = false
)

abstract class ButtonHuyetDataBase : RoomDatabase() {
    abstract fun getButtonHuyetDao(): ButtonHuyetDao

    companion object {
        @Volatile
        private var instance: ButtonHuyetDataBase? = null

        private val LOCK = Any()

        operator fun invoke(context: Context) = instance
            ?: synchronized(LOCK) {
                instance
                    ?: buildDataBase(
                        (context)
                    ).also {
                        instance = it
                    }
            }

        private fun buildDataBase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            ButtonHuyetDataBase::class.java,
            "huyetdaodatabase"
        ).build()
    }

}