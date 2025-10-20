package com.example.miprimeraappcompose.sintaxis

fun main(){
    val listOfPokemons = mutableListOf<String>("Pikachu","Charmander","Squirtle")
    listOfPokemons.add("Bulbasaur")
    listOfPokemons.add("Mew")
    listOfPokemons.add("Pikachu")
    println("Lista de Pokemons $listOfPokemons")

//Tengo ya a Pikachu pero me deja añadirlo. Esto es un problema. Para eso uso los sets principalmente

    val setOfPokemons = mutableSetOf<String>("Pikachu","Charmander","Squirtle")
    setOfPokemons.add("Bulbasaur")
    setOfPokemons.add("Mew")
    setOfPokemons.add("Pikachu")
    println("Set de Pokemons $setOfPokemons") //Con set, no se añaden los elementos repetidos

    //println(setOfPokemon[0]) //Da un error porque no contiene valores ordenados, también llamados indexables.


}