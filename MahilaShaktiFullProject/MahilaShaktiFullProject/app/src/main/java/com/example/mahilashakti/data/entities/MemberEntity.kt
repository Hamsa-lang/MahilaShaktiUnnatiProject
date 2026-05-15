package com.example.mahilashakti.data.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "members")
data class MemberEntity(
    @PrimaryKey(autoGenerate = true)
    val memberId: Int = 0,
    val name: String,
    val phone: String,
    val address: String,
    val joinDate: String
)