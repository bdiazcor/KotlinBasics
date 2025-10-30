package com.example.miprimeraappcompose.lambda

fun main(){
    /*** Cuando escribiste la función coins(), declaraste de forma explícita el nombre quantity para
    el parámetro Int de la función. Sin embargo, como viste con la función cupcake(),
    puedes omitir el nombre del parámetro por completo. Cuando una función tiene un solo parámetro
    y no proporcionas un nombre, Kotlin le asigna de forma implícita
    el nombre it, de manera que puedes omitir el nombre del parámetro y el símbolo ->,
    lo que hace que tus expresiones lambda sean más concisas
     Sintaxis:
     val coins(): (Int) -> String = { "$it euros"}
     ***/

    /*** También se puede pasar una lambda directamente como parámetro ***/

    val treatFunction = trickOrTreat2(false,5, {"$it euros"})
    treatFunction() //Es el resultado devuelto de trickOrTreat


    /*** Tailing lambda: cuando un tipo de función es el último parámetro de una función, puedes
     colocar la lambda después del paréntesis de cierre para llamar a la función
     Sintaxis:
     nom_función(parámetros no lambda) { lambda }
     ***/

    val treatFunction2 = trickOrTreat2(false,null) {"Have a cupcake!"}
    repeat(4) {
        treatFunction2() //Resultado devuelto de trickOrTreat2 4 veces
    }


}