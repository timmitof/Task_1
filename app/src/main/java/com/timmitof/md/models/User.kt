package com.timmitof.md.models

import android.text.Editable
import java.io.Serializable
import java.util.*

data class User(
    //User name
    var name: String,
    //User age
    var age: Int,
    //User gender
    var gender: Gender,
    //User birth date
    var birthDate: Date
): Serializable
