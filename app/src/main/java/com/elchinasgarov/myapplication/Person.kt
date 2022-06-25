package com.elchinasgarov.myapplication

import java.io.Serializable

data class Person(
    val name : String,
    val surname : String,
    val age : Int
):Serializable
