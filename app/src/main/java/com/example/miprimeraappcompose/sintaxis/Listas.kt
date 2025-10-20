package com.example.miprimeraappcompose.sintaxis

fun main(){
    var friends = listOf<String>("Maria","Beatriz","Jose")
    var ages = listOf<Int>(20,23,50)

    //println( friends [1])
    //println(ages [1])
    //println(friends.first())
    //println(friends.last())
    //println(friends.size)

    //friends[0]="Juan" //Da error porque esta forma de acceder a los elementos es solamente una get

    //GET: Función get ("Getter" de valores). Ambos comandos abajo
    //println(friends[0])
    //println(friends.get(0)) //Función get ("Getter" de valores)

    //SET Función set (para "setter" de valores). Esto no funciona
    //println(friends.set(0,"Juan")) // No funciona porque cuando se crea una lista se crea como lista de valores inmutable. No se pueden modificar

    //Para poder editar una lista tenemos que hacerla mutable
    //var newFriends = mutableListOf<String>("Maria","Beatriz","Jose")

    //Modificamos un valor: ejemplo, ahora el elemento 0 va a ser Luis
    //newFriends.set(0,"Luis")
    //println(newFriends[0])

    //Puedo añadir un valor
    //newFriends.add("Juan") //Los valores en una lista siempre van a estar ordenados para poder acceder por su índice.
    //println(newFriends)

    //Puedo eliminar un valor
    //newFriends.remove("Luis")
    //println(newFriends)

    //Puedo eleminar por índice
    //newFriends.removeAt(0)
    //println(newFriends)

    //Puedo eliminar los elementos que cumplan una condición
    //newFriends.add("Leonardo")
    //newFriends.add("Penelope")
    //newFriends.add("Marta")
    //println(newFriends)
    //newFriends.removeIf{it.length > 5}
    //println(newFriends)

    //Puedo vaciar la lista por completo
    //newFriends.clear()
    //println(newFriends)







}