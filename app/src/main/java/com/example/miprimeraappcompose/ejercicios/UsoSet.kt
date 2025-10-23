package com.example.miprimeraappcompose.ejercicios

/*Crea un programa que permita almacenar un conjunto de números enteros usando un Set.
Luego, agrega un número al conjunto e intenta agregar un número duplicado para demostrar
 que no se permiten duplicados. Finalmente, muestra todos los números del conjunto.*/

fun main(){
    val numero = mutableSetOf(1,3,5,7,9,11,13)
    println("Mi conjunto es: $numero")

    //Agrego un número a la lista y lo muestro
    numero.add(15)
    println("He añadido un número. Mi nuevo conjunto es: $numero")

    //Agrego un número duplicado y lo muestro
    numero.add(13)
    println("Estoy tratando de incluir un número duplicado. Mi conjunto es: $numero")


}