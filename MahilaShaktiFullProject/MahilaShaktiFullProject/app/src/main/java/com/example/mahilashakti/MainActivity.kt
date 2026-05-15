package com.example.mahilashakti

import android.os.Bundle
import android.widget.*
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.mahilashakti.data.entities.MemberEntity
import com.example.mahilashakti.viewmodel.MemberViewModel

class MainActivity : AppCompatActivity() {

    private val memberViewModel: MemberViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val etPhone = findViewById<EditText>(R.id.etPhone)
        val etAddress = findViewById<EditText>(R.id.etAddress)
        val etJoinDate = findViewById<EditText>(R.id.etJoinDate)
        val btnSave = findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {

            val member = MemberEntity(
                name = etName.text.toString(),
                phone = etPhone.text.toString(),
                address = etAddress.text.toString(),
                joinDate = etJoinDate.text.toString()
            )

            memberViewModel.insert(member)

            Toast.makeText(
                this,
                "Member Saved",
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}