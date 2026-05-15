package com.example.mahilashakti.viewmodel

import android.app.Application
import androidx.lifecycle.*
import com.example.mahilashakti.data.database.AppDatabase
import com.example.mahilashakti.data.entities.MemberEntity
import com.example.mahilashakti.repository.MemberRepository
import kotlinx.coroutines.launch

class MemberViewModel(application: Application)
    : AndroidViewModel(application) {

    private val repository: MemberRepository

    val allMembers: LiveData<List<MemberEntity>>

    init {

        val memberDao =
            AppDatabase.getDatabase(application).memberDao()

        repository = MemberRepository(memberDao)

        allMembers = repository.allMembers
    }

    fun insert(member: MemberEntity) =
        viewModelScope.launch {
            repository.insert(member)
        }
}