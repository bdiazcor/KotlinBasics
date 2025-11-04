package com.example.miprimeraappcompose.clases

class Rectangulo(
    val ancho: Double,
    val alto: Double
) {
    fun calculoArea(): Double{
        val area = ancho * alto
        return area
    }
}