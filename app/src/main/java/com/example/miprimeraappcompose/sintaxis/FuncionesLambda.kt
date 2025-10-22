package com.example.miprimeraappcompose.sintaxis

/*Mini-chuleta Lambdas
- Creo una lambda: val f = { /* código */ }
- Llamo a esa lambda: f()
- Paso una lambda como argumento:
    * funcion(1, 2, { /* lambda */ }) ← clásica, lambda dentro de paréntesis como un parámentro más
    * funcion(1, 2) { /* lambda */ } ← trailing lambda (si es el último parámetro). Se saca del aréntesis entre {}


- it se puede usar si la lambda tiene un solo parámetro y no lo nombras.
- Si hay más de un parámetro, nómbralos: { a, b -> ... }.

Regla mental rápida
- Veo llaves {} → “están definiendo una mini-función”.
- Veo paréntesis () → “están llamando a algo o pasando cosas a una función”.

Ejemplos:
- val saludar = { ... } usa llaves (definir).
- saludar() usa paréntesis (llamar).
- forEach { ... } usa llaves fuera (pasar la lambda final de forma más cómoda). //Trailing lambda
*/

fun main(){

    //Ejemplo de lambda
    println("Ejemplo 1: Asignamos una lambda a un acción")
    val saludar = {println("Hi!")}
    saludar()

    //Ejemplo de lambda para repetir acciones en listas

    val friends = listOf("Monica", "Ross", "Joey", "Rachel", "Chandler", "Phoebe")

    //Si no le pongo nombre al parámetro, toma el valor de it
    println("Ejemplo 2:  con it")
    friends.forEach { println("Hola $it") }

    //Si nombro el parámetro
    println("Ejemplo 3: nombrando el parámentro")
    friends.forEach{ friend -> println("Hi $friend")}

    //Ejemplo filtrando o transformado datos
    val numeros = listOf(1,2,3,4,5)
    var pares = numeros.filter{it % 2 == 0}
    println("Lista completa: $numeros")
    println("Lista pares: $pares")

    //Ejemplo de uso de lambda para dar instrucciones personalizadas
    myFuncion(friends[0],{println("Hola $it")})

    //Lo mismo que usando trailing lambda
    myFuncion(friends[1]){println("Hola $it")}

    //Lo mismo que usando trailing lambda y nombrando el parámentro
    myFuncion(friends[2]){friend -> println("Hola $friend")}

    //Instrucciones personalizadas con más de un parámetro: Lambda es un println
    myFuncion2(friends[0], friends[1]){mensaje -> println(mensaje)  }

    //Instrucciones personalizadas con más de un parámetro: lambda asigna un valor a una variable)
    var saludo2 = " "
    myFuncion2(friends[0], friends[1]){mensaje -> saludo2 = mensaje  }
    println(saludo2)
}

fun myFuncion(name: String, accion:(nombre:String)->Unit) {
    println("Ejemplo4: estoy usando una lambda como parámetro")
    accion(name)
    println("Fin de ejecución de la lambda")
}

//Función con dos parámetros
fun myFuncion2(name1:String, name2: String, saludo:(mensaje:String) -> Unit){
    println("Ejemplo4: estoy usando una lambda como parámetro con dos parámetros")
    saludo("Hello $name1, Hello $name2")
    println("Fin de ejecución de la lambda con dos parámetros")
}


