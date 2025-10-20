package com.example.miprimeraappcompose.sintaxis

fun main(){

    var name = "Jose"
    var course = null //Como todavía no tengo ningún curso y no lo puedo asociar, lo declaro nulo

    //course = "Kotlin" //Se le asigna el curso de Kotlin a la variable course, declarado como Nothing, da error porque le estoy asignando un string

    //Se soluciona decalarando la variable que inicializo como null con el tipo que le voy a asignar con ?: Ejemplo: var nombre_var: String? = null
    var course2: String? = null

    course2 = "Kotlin"

    if (course2 == null){
        println("$name no está estudiando nada")
    } else {
        println("$name está estudiando el curso $course2") //Si course2 todavía no tiene valor, va a salir algo raro: "Jose está estudiando el curso null"
    }
    //Por ello se suelen poner un condicional, para evitar valores extraños

    var num1: Int? = 10

    //var result = num1 + 5 //Da error sumar un Int con un valor null con un entero. No es lo mismo tener un valor null que un entero

    //Se arregla diciendo a Kotlin que yo estoy seguro que tiene un valor: "!!": variable!!
    var result = num1!! + 5 //Yo me hago responsable de que esto no va a fallar

    println(result)

}