package com.example.miprimeraappcompose.ejercicios

/*Uso de Lambdas: Ordenar nombres por longitud.
Crea una función que ordene una lista de nombres según la longitud de cada nombre
utilizando una lambda. La función debe aceptar una lista de cadenas y
devolverla ordenada de menor a mayor longitud.
 */

fun main(){
    val miListaNombres = listOf("Monica","Ross","Joey","Rachel","Chandler","Phoebe")

    //Orden ascendente
    val miListaOrdenada = miListaNombres.sortedBy { it.length }

    println("Mi lista ordenada por tamaño de nombre ascendente: $miListaOrdenada")

    //Orden descendente
    val miListaOrdenadaDescendente = miListaNombres.sortedByDescending { it.length }
    println("Mi lista ordenada por tamaño de nombre descendente: $miListaOrdenadaDescendente")

}