package com.timmitof.md

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val user = intent.getSerializableExtra("user")
        Log.i("User", user.toString())
//        val name = intent.getStringExtra("NAME")
//        val age = intent.getStringExtra("AGE")
//        val date = intent.getStringExtra("DATE")

//        if (name != null && age != null && date != null){
//            Log.i("Name", name)
//            Log.i("Age", age)
//            Log.i("Date", date)
//        }
    }
}