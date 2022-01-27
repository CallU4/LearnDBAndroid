package com.example.learndbandroid.daos

import androidx.room.Dao
import androidx.room.Query
import com.example.learndbandroid.entities.User

@Dao
interface UserDao {

    @Query("Select * from user")
    fun getAll(): List<User>
}