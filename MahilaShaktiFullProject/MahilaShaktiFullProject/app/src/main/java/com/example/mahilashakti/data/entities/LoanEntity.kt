package com.example.mahilashakti.data.entities

import androidx.room.*

@Entity(
    tableName = "loans",
    foreignKeys = [
        ForeignKey(
            entity = MemberEntity::class,
            parentColumns = ["memberId"],
            childColumns = ["memberOwnerId"],
            onDelete = ForeignKey.CASCADE
        )
    ]
)
data class LoanEntity(
    @PrimaryKey(autoGenerate = true)
    val loanId: Int = 0,
    val memberOwnerId: Int,
    val principalAmount: Double,
    val interestRate: Double,
    val loanDate: String,
    val dueDate: String,
    val amountPaid: Double,
    val loanStatus: String
)