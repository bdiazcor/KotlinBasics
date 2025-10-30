package com.example.miprimeraappcompose.lambda

//Pasando coins como parámetro

fun main(){
    val coins: (Int)->String = {quantity -> "$quantity euros"}
    val cupcake: (Int) -> String = {"Have a cupcake!"}

    println("Truco")
    val trickFunction = trickOrTreat2(true,null,null)
    trickFunction()
    println("Trato (monedas)")
    val treatFunction = trickOrTreat2(false,6,coins)
    treatFunction()
    println("Trato (cupcakes)")
    val treatFunction1 = trickOrTreat2(false,null,cupcake)
    treatFunction1()
}
val trick4 = { println ("No treat!")}
val treat4 : () -> Unit = {println("Have a treat!")}

fun trickOrTreat2(isTrick:Boolean, coins: Int?, extraTreat: ((Int)->String)?): () -> Unit {
    if (isTrick) {
        return trick4
    } else if (extraTreat != null) {
        if (coins != null) {
            println(extraTreat(coins))
        } else {
            println(extraTreat(0))
        }
        return treat4
    } else return treat4

}



