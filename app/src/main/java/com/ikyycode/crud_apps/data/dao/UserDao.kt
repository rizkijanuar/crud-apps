package com.ikyycode.crud_apps.data.dao

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.ikyycode.crud_apps.data.entity.User

interface UserDao {

    @Query("SELECT * FROM user")
    fun getAll(): List<User>

    @Query("SELECT * FROM user WHERE uid IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<User>

    @Insert
    fun insertAll(vararg users: User)

    @Delete
    fun delete(user: User)

}