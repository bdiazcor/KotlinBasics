package com.example.miprimeraappcompose.ejercicios

/* Uso de Lambdas: Filtrar números pares.
Crea una función que reciba una lista de números enteros y una función lambda que
determine si un número es par.Usa la lambda para filtrar y devolver una nueva lista
que contenga solo los números pares.*/

fun main(){
    val miLista = listOf(1,2,3,4,5,6,7,8,9,10)

    val pares = miLista.filter { it % 2 == 0 }
    println("La lista de pares es: $pares")
}