package com.example.miprimeraappcompose.sintaxis

fun main(){

    //Con una data class puedo crear usuarios
    val beatriz:Person = Person("Beatriz", "Diaz", CivilStatus.Married)
    val luis:Person = Person("Luis","Garcia", CivilStatus.Single)

    println(beatriz.name)
    println(luis.name)



}