package com.example.miprimeraappcompose.lambda

fun main(){

    /*Creamos una variable trickFunction y asignamos la función trick().
    Sintaxis val o var nombre_variable = :: nombre_función   */
    val trickFunction = ::trick
    trick()
    trickFunction()

    /* También puedes asignar su valor a otras variables como cualquier otro tipo de dato y
    llamar a la función con el nombre de la variable nueva.*/
    val trickFunctionLambda = trick2

    //Lamamos a la función trick2
    trick2()

    //También se puede llamar a partir de la variable a la que hemos asignado la lambda
    trickFunctionLambda()

    /* En conclusion, con las expresiones lambda, se pueden crear variables que almacenen funciones y llamar a
    estas variables como funciones y almacenarlas en otras variables que también se pueden
    llamar como funciones*/


}

//Definimos una función sin parámetros y sin valor de retorno que imprima "No treats!"
fun trick() {
    println("No treats!")
}

/* Las expresiones lambda son expresiones concisas que no necesitan declararse con la
    palabra clave "fun". Y para almacenarse en una variable, no necesitan el operador de referencia
    de funcion
    Sintaxis: val o var nombre_variable = { cuerpo de la función }
    Cuando defines una función con una expresión lambda, tienes una variable que hace referencia a
    la función.*/

//Definimos la función trick2 como una expresión lambda. En este caso una variable que almacena un valor.
val trick2 = { println("No treats!")}
