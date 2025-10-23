package com.example.miprimeraappcompose.ejercicios

/* Desarrolla una función que reciba el peso y altura de una persona y calcule su IMC.
Ejecuta esta función con los datos de una persona ejemplo e imprime el resultado. */

fun main(){
    var peso: Int
    var altura: Float

    //Llamar a la función con el peso en kg y la altura en metros
    IMC(55,1.65f)

}

fun IMC(peso: Int, altura: Float){

    println("El IMC es: ${peso/(altura*altura)}")

}