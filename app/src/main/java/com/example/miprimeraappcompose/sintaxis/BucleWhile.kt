package com.example.miprimeraappcompose.sintaxis

fun main(){
    var listOfFriends = listOf("Ross", "Monica", "Joey", "Beatriz", "Luis", "Jose", "Miguel", "Carolina")
    var index= 0

    while(index < listOfFriends.size){
        println(listOfFriends[index])
        index++ //También: index += 1 o index = index + 1 (aunque el IDE recomienda index += 1)
    }
}