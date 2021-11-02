package com.timmitof.md

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var firstName: EditText
    lateinit var age: EditText
    lateinit var birthDate: EditText

    lateinit var saveBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstName = findViewById(R.id.firstName)
        age = findViewById(R.id.age)
        birthDate = findViewById(R.id.birthDate)
        saveBtn = findViewById(R.id.saveBtn)

        saveBtn.setOnClickListener{
            val name = firstName.text
            val ageText = age.text
            val birth = birthDate.text
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)

        }
    }
}