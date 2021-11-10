package com.timmitof.md

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.timmitof.md.models.Gender
import com.timmitof.md.models.User
import java.util.*

class MainActivity : AppCompatActivity() {
    var arrayList = arrayListOf<String>()
    var mutableList = mutableListOf<String>()
    var list = listOf<String>()
    var people = mutableListOf<Human>()

//    lateinit var firstName: EditText
//    lateinit var age: EditText
//    lateinit var birthDate: EditText
//
//    lateinit var saveBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        arrayList.add("Test") //0
//        arrayList.add("Test2") //1
//        arrayList.add("Test3") //2
//        arrayList.add("Test4") //3
//
//        mutableList.add("Mutable")
//        mutableList.add("Mutable2")
//        mutableList.add("Mutable3")
//        mutableList.add("Mutable4")
//
//        list = list + "List"
//        list = list + "List2"
//        list = list + "List3"
//        list = list + "List4"
//
//        var firstElement = arrayList[0]
//        var firstElement2 = arrayList.get(0)
//        var firstElement3 = arrayList.first()
//
//        var index = 0
//        while (index < arrayList.size) {
//            Log.i("ArrayList index: $index", arrayList[index])
//            ++index
//        }
//
//        for (item in mutableList) {
//            Log.i("Loop for", item)
//        }

//        firstName = findViewById(R.id.firstName)
//        age = findViewById(R.id.age)
//        birthDate = findViewById(R.id.birthDate)
//        saveBtn = findViewById(R.id.saveBtn)
//
//        saveBtn.setOnClickListener{
//            val name = firstName.text.toString()
//            val ageText = age.text.toString().toInt()
//            val birth = birthDate.text
//            val gender = Gender.male
//
//            val user: User = User(name, ageText, gender, Date(2001,12,28))
//
//            val intent = Intent(this, SecondActivity::class.java)
//
//            intent.putExtra("user", user)
//            intent.putExtra("NAME", name)
//            intent.putExtra("AGE", ageText)
//            intent.putExtra("DATE", birth)

//            startActivity(intent)

        }

    data class Human(
        var name: String,
        var age: Int,
        var type: String
    )
//}

    override fun onResume() {
        super.onResume()

        Log.i("OnResume", "ВОСПРОИЗВЕДЕНИЕ!")
    }

    override fun onStart() {
        super.onStart()

        Log.i("OnStart", "СТАРТ!")
    }

    override fun onPause() {
        super.onPause()
        Log.i("OnPause", "ПАУЗА!")
        Toast.makeText(this, "OnPause!", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()

        Log.i("OnStop", "СТОП!")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.i("OnDestroy", "УНИЧТОЖЕНИЕ!")
    }
}