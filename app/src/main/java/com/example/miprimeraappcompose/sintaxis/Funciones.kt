package com.example.miprimeraappcompose.sintaxis

fun main(){
    //Por aquí empieza el programa
    val name = "Beatriz"
    val lastName = "Diaz"

    saludarA(name = name, lastName = lastName) //Puedo cambiar el orden
    despedirA(name, lastName) //No puedo cambiar el orden
}

//Me la llevo a fichero Saludos para dejar el código más modular
//fun saludarA(){
//    val name = "Beatriz Diaz"
//    println("Hola $name, ¿cómo estás?")
//}