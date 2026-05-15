package com.example.mahilashakti.repository

import androidx.lifecycle.LiveData
import com.example.mahilashakti.data.dao.MemberDao
import com.example.mahilashakti.data.entities.MemberEntity

class MemberRepository(private val memberDao: MemberDao) {

    val allMembers: LiveData<List<MemberEntity>> =
        memberDao.getAllMembers()

    suspend fun insert(member: MemberEntity) {
        memberDao.insertMember(member)
    }
}