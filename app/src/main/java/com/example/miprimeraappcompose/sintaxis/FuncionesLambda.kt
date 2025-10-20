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

    //Puedo crear una variable y asignarle una función aunque no reciba ni haga nada. Esto no da error.
    val myFunction = fun() {}

    //O puedo asignarle una acción y Lo que ya hicimos con un bucle for se puede hacer con una función lambda que existe en las listas
    //Ejemplo 2
    println("Ejemplo 2")
    val saludar = { println("Hola!")}
    saludar()

    //Ejemplo 3
    println("Ejemplo 3")
    val friends = listOf("Ross", "Monica", "Joey")

    friends.forEach { println("Hi $it") }  //Siempre reciben un parámetro. Si no le pongo nombre se llama 'it'

    //Puedo poner nombre al parámetro. Entonces uso -> para indicar donde comienza la función
    println("Ejemplo 4")
    friends.forEach { name -> println("Hi $name") }

    //Ejemplos de pasar una función lambda como un parámetro a una función que he creado yo
    println("Ejemplo5: Con un parámetro y lambda como argumento entre ()")
    myLambda("Beatriz",{println(it)})

    println("Ejemplo6: Con dos parámetros y lambda como argumento entre ()")
    myLambda2("Beatriz","Diaz", {fullName -> println(fullName)})

}

//Función que reciben una función
fun myLambda(name: String, saludar: (nombre:String) -> Unit){
    println("Estoy configurando una función lambda")
    saludar("Hello $name")
    println("Estoy saliendo de mi funcion lambda")
}

fun myLambda2( name: String,lastName: String, saludar:(fullName: String)->Unit){
    println("Estoy configurando una función lambda2")
    saludar("$name $lastName")
    println("Estoy saliendo de mi funcion lambda2")
}


