package com.example.miprimeraappcompose.ejercicios

/* Ejercicio de developer.android: Movie-ticket Price
https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?hl=es-419#2
 */


fun main() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean): Int {
    // Fill in the code.
    //Como hay varias opciones, usamos when
    when(age){
        in 0..12 -> return 15
        in 13..60 -> return if(isMonday) { 25 } else  { 30 } //Recomendacion de Kotlin
        //in 13..60 -> if(isMonday) { return 25} else  { return 30} //Alternativa sin sacar return fuera
        in 61..100 -> return 20
        else -> return -1
    }
}
