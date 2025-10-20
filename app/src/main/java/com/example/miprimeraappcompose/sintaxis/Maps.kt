package com.example.miprimeraappcompose.sintaxis

fun main(){

    val mapOfPokemons = mutableMapOf("Pikachu" to "electric",
        "Charmander" to "fire")
    println("1. Mapa inicial: $mapOfPokemons")


    println("2. Valor de Pikachu: ${mapOfPokemons["Pikachu"]}")

    //En los maps mutables puedo añadir valores y se hace
    //Modo 1: con la función put()
    mapOfPokemons.put("Squirtle", "water")
    println("3. Valor de Squirtle: ${mapOfPokemons["Squirtle"]}")

    //Modo 2: declarando el valor
    mapOfPokemons["Mew"] = "psychic"
    println("4. Valor de Mew: ${mapOfPokemons["Mew"]}")

    println("5. Mapa final de Pokemons: $mapOfPokemons")


}