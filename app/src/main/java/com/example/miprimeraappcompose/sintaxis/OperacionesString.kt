package com.example.miprimeraappcompose.sintaxis

fun main(){
    val name = "Beatriz"
    val lastName = "Diaz"

    //Concatenación de dos palabras
    val fullName = name + lastName
    println(fullName)

    //Concatenación de dos palabras con espacio
    val fullName2 = "$name $lastName"
    println(fullName2)

    //Template concatenado
    val fullName3 = "$name $lastName es mi nombre"
    println(fullName3)

}
