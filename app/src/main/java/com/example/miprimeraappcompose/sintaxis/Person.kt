package com.example.miprimeraappcompose.sintaxis

//Una dataclass es una clase pero sin métodos. Solo parámetros.
//Ejemplo: creamos una data class solo con dos valores
data class Person(
    val name: String,
    val lastName: String,
    val civilStatus: CivilStatus
)
