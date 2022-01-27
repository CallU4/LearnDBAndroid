package com.example.learndbandroid.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Fts4
import androidx.room.PrimaryKey

@Entity(tableName = "User")
data class User(

    @PrimaryKey val id: Int,
    @ColumnInfo(name = "fName") val fName: String?,
)
