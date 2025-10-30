package com.example.miprimeraappcompose.ejercicios

/* Uso de Map: Crea un programa que permita almacenar los nombres de productos y
sus respectivos precios usando un Map. Luego, muestra todos los productos y precios.
A continuación, pide al usuario que ingrese el nombre de un producto, y si existe,
muestra su precio. Si no existe, muestra un mensaje indicando que el producto no fue encontrado.
Para que el usuario ingrese los datos utiliza la función readln().
 */

fun main(){
    val productos: MutableMap<String, Number>? = mutableMapOf(
        "Leche" to 1.2,
        "Pan" to 1,
        "Galletas" to 3,
        "Arroz" to 2.5
    )

    println("Introduce un producto")
    val producto = readln()

    if (productos?.get(producto) == null){
        println("El producto no fue encontrado")
    }else{
        println("El precio del producto es: ${productos[producto]}")
    }

}