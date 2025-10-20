package com.example.miprimeraappcompose.sintaxis

fun main(){

    val name = "Beatriz Diaz"
    val role = "admin" //Administrador o usuario normal
    val age = 17

    //Usamos "if" para que el programa tome decisiones en función de estos valores
    //if(age > 18){
    //    println("$name es mayor de edad")
    //}

    //Si queremos otra condición
    //if(age > 50){
    //    println("$name es una adulto mayor")
    //}

    //Anidamos condiciones if
    if (age > 50){
        println("$name es un adulto mayor")
    }else if(age > 30){
        println("$name es un adulto")
    }else if(age > 18){
        println("$name es un adulto joven")
    }else {
        println("$name es menor de edad")
    }

    //Hacemos condicion con el rol
    if(role == "user"){
        println("Tienes acceso a tu perfil")
    }else if(role == "admin"){
        println("Tienes acceso a todo el sistema")
    }else{
        println("No tienes acceso al sistema")
    }

}