package com.example.miprimeraappcompose.ejercicios

/* Uso de Listas: Definir la siguiente lista de números enteros: {1, 2, 5, 7, 8, 11}.
Implementar las siguientes funciones que tomen como parámetro la lista anterior y devuelvan:
- La suma de los elementos de la lista.
- Una lista con los números pares.
- El máximo de la lista.
- Una lista cuyos elementos son el doble de los de la lista parámetro.*/

fun main(){
    val miLista = listOf(1,2,3,5,7,8,11)

    //Suma de los elementos de la list
    val suma = miLista.sum()
    println("La suma es: $suma")

    //Lista con los número pares
    val pares = miLista.filter { it % 2 == 0 }
    println("Los números pares son: $pares")

    //Lista con el máximo de la lista)
    val maximo = miLista.max()
    println("El valor máximo de la lista es: $maximo")

    //Lista cuyos elementos son el doble de la lista
    val doble = miLista.map { it * 2 }
    println("La lista con los elementos dobles es: $doble")
}