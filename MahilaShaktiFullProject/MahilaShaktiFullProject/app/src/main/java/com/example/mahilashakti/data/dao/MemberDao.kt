package com.example.mahilashakti.data.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mahilashakti.data.entities.MemberEntity

@Dao
interface MemberDao {

    @Insert
    suspend fun insertMember(member: MemberEntity)

    @Query("SELECT * FROM members")
    fun getAllMembers(): LiveData<List<MemberEntity>>
}