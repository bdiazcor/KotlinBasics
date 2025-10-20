package com.example.miprimeraappcompose.sintaxis

//Crea el formato de clase más sencillo posible que basicamente está vacia

//Agregamos parámetros a una clase declarando la propiedades que queremos que tenga la clase dentro de ()
class Usuario (
    val name:String,
    val age:Int,
    private val email: String,
    private val DNI: String,
    //Añado la variable amigos que es una lista que puede cambiar
    private val friends: MutableList<Usuario> = mutableListOf()
) {

    //Defino los métodos que aplican a la clase
    //Puedo declarar una función de obtención del email solo en ciertos casos. Ej: rol "admin"
    //Ahora la clase tiene estos dos métodos y el objeto beatriz también
    fun getEmail(rol: String) {
        if (rol == "admin") {
            println(email)
        }
    }

    fun getDNI(rol: String) {
        if (rol == "admin") {
            println(DNI)
        }
    }

    //Creo un metodo para añadir amigos a las lista de amigos
    fun addFriend(friend: Usuario){
        friends.add(friend)
    }

    //Creo metodo para mostrar amigos
    fun getFriends(){
        println("Amigos de $name:") //name contiene el nombre del objeto que nos esté llamando
        friends.forEach { friend -> println(friend.name) } //como friends es de tipo lista tiene el metodo forEach
    }

}