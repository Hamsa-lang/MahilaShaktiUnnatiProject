package com.example.mahilashakti.data.dao

import androidx.room.*
import com.example.mahilashakti.data.entities.LoanEntity

@Dao
interface LoanDao {

    @Insert
    suspend fun insertLoan(loan: LoanEntity)

    @Query("SELECT COUNT(*) FROM loans WHERE memberOwnerId = :memberId AND loanStatus='UNPAID'")
    suspend fun hasUnpaidLoan(memberId: Int): Int
}