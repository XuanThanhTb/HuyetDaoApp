package com.example.huytoapp.dp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Huyet::class],
    version = 1,
    exportSchema = false
)

abstract class HuyetDataBase : RoomDatabase() {
    abstract fun getHuyetDao(): HuyetDao

    companion object {
        @Volatile
        private var instance: HuyetDataBase? = null

        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDataBase((context)).also {
                instance = it
            }
        }

        private fun buildDataBase(context: Context) = Room.databaseBuilder(
            context.applicationContext,
            HuyetDataBase::class.java,
            "huyetdaodatabase"
        ).build()
    }
}