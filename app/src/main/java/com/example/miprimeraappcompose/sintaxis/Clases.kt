package com.example.miprimeraappcompose.sintaxis

fun main(){

    //Creo un objeto de la clase usuario
    val beatriz: Usuario = Usuario("Beatriz",
        35,
        email ="bdc527@educa.madrid.org",
        "05555555D")

    //¿Qué puedo hacer ahora con la clase?

    println(beatriz.name)
    println(beatriz.age)
    //println(beatriz.email)
    //println(beatriz.DNI)

    //Por ejemplo, hay información sensible a la que no quiero que sea acceda: email y DNI
    //Vuelvo a la clase Usuario y los declaro como privados "private"
    //Cuando hago esto, da error de acceso a email y DNI. Es como si la información no existiera.
    //Los valores no accesibles "private" se usan a través de los métodos. También declarados en la clase
    //Se pinta la información email y DNI porque el rol está autorizado
    println("Rol admin")
    beatriz.getEmail("admin")
    beatriz.getDNI("admin")

    //Aquí no me muestra la información email o DNI porque el rol no está autorizado
    println("Rol user")
    beatriz.getEmail("user")
    beatriz.getDNI("user")

    //Ahora quiero añadir una variable que contenga los amigos de beatriz. Necesito crearla en la clase y añadir un metodo que permita incluirlos
    val luis: Usuario = Usuario("Luis",
        36,
        email ="luis527@educa.madrid.org",
        "05555556D")

    val sonia: Usuario = Usuario("Sonia",
        37,
        email ="sonia527@educa.madrid.org",
        "05555557D")

    //Añado amigos a beatriz usando el metodo que he creado (addFriend)
    beatriz.addFriend(luis)
    beatriz.addFriend(sonia)
    luis.addFriend(beatriz)
    luis.addFriend(sonia)
    sonia.addFriend(beatriz)
    sonia.addFriend(luis)

    //Ahora queremos tener un metodo que me muestra los amigos de cada uno. Lo creo en la clase usuario (getFriends)
    beatriz.getFriends() //No le envio ningún parámetro pero internamente usa el nombre de la instancia que le llama, en este caso beatriz
    luis.getFriends()
    sonia.getFriends()

    //Esto es muy valioso porque en un objeto (beatriz o luis o sonia) puedo incluir toda la información relacionada con ese objeto


}