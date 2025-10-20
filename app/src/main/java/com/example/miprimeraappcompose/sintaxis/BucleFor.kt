package com.example.miprimeraappcompose.sintaxis

fun main(){
    var friends = listOf("Ross", "Monica", "Joey", "Beatriz", "Luis", "Jose", "Miguel", "Carolina")

    //Con el bucle for itero sobre los valores de una lista y realizo una acción
    for(friend in friends) {
        println("Hi $friend")
    }
}