package com.example.miprimeraappcompose.ejercicios

/* Ejercicio de developer.android: Notificaciones móviles
https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?hl=es-419#1
 */

fun main(){
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

/*Programa que imprime el resumen según la cantida de notificaciones recibidas
Incluye: Cantidad de notificaciones si son menos de 100 y 99+ si son más de 100*/
fun printNotificationSummary(numberOfMessages: Int) {
    // Fill in the code.
    if(numberOfMessages < 100){
        println("El número de notificaciones recibido es: $numberOfMessages")
    }else{
        println("El número de notificaciones recibido es 99+")
    }

}