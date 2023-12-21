package com.ikyycode.crud_apps.data

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.ikyycode.crud_apps.data.dao.UserDao

abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao

    companion object {
        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(context, AppDatabase::class.java, "app_database")
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build()
            }
            return instance!!
        }
    }


}