package com.example.mahilashakti.data.database

import android.content.Context
import androidx.room.*
import com.example.mahilashakti.data.dao.*
import com.example.mahilashakti.data.entities.*

@Database(
    entities = [MemberEntity::class, SavingsEntity::class, LoanEntity::class],
    version = 1
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun memberDao(): MemberDao
    abstract fun savingsDao(): SavingsDao
    abstract fun loanDao(): LoanDao

    companion object {

        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {

                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "mahila_db"
                ).fallbackToDestructiveMigration().build()

                INSTANCE = instance
                instance
            }
        }
    }
}