package com.example.miprimeraappcompose.ejercicios

/*Desarrolla una función que reciba el nombre del producto, su precio y el porcentaje de IVA,
y devuelva el precio final con impuestos. Ejecuta esta función para los siguientes productos e
imprime el resultado:
- Pan – 0,6€ - IVA 0%
- Leche – 1€ - IVA 10%
- Gasoil – 1,40€ - IVA 15%
*/

fun main(){
    var precio: Float
    var IVA: Int
    var precioTotal: Float
    val precioPan: Float
    val precioGasoil: Float

    //Precio del pan
    precioTotal = precioTotal(0.6f,0)
    println("El precio total del pan es: $precioTotal")

    //Precio de la leche
    precioTotal = precioTotal(1f,10)
    println("El precio total de la leche es: $precioTotal")

    //Precio del gasoil
    precioTotal = precioTotal(1.4f,15)
    println("El precio total del gasoil es: $precioTotal")
}

fun precioTotal(precio: Float,IVA:Int): Float{
    var precioTotal = precio + (precio * IVA/100)
    return precioTotal
}