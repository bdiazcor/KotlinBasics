package com.example.miprimeraappcompose.sintaxis

fun main(){
    val name = "Beatriz Diaz"
    val age = 17
    val role = "guest"

    //Forma 1
    when{
        age > 60 -> println("Jubilado")
        age > 30 -> println("Es un adulto")
        age > 18 -> println("Mayor de edad")
        else -> println("Menor de edad")
    }

    //Forma 2
    when(role){
        "admin" -> println("Tienes acceso total al sistema")
        "user" -> println("Tienes acceso a tu perfil")
        else -> println("No tienes acceso")
    }

}