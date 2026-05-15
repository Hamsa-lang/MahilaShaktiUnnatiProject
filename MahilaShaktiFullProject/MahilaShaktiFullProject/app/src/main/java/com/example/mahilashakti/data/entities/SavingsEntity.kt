package com.example.mahilashakti.data.entities

import androidx.room.*

@Entity(
    tableName = "savings",
    foreignKeys = [
        ForeignKey(
            entity = MemberEntity::class,
            parentColumns = ["memberId"],
            childColumns = ["memberOwnerId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class SavingsEntity(
    @PrimaryKey(autoGenerate = true)
    val savingId: Int = 0,
    val memberOwnerId: Int,
    val amount: Double,
    val weekDate: String,
    val status: String
)