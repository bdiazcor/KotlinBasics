package com.example.miprimeraappcompose.clases

fun main(){
    val historia = Libro("Los reyes de España","Cervantes", 1200)
    println(historia)
    val historia2 = historia.copy("Los castillos de España")
    println(historia2)
}