package com.example.mahilashakti.data.dao

import androidx.room.*
import com.example.mahilashakti.data.entities.SavingsEntity

@Dao
interface SavingsDao {

    @Insert
    suspend fun insertSaving(saving: SavingsEntity)

    @Query("SELECT SUM(amount) FROM savings WHERE memberOwnerId = :memberId")
    suspend fun getTotalSavings(memberId: Int): Double?
}