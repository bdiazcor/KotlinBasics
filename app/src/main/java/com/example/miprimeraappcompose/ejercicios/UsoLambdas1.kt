package com.example.miprimeraappcompose.ejercicios

/* Uso de Lambdas. Ejercicio de developer.android: Conversor de temperatura (realizalo en Android Studio)
https://developer.android.com/codelabs/basic-android-kotlin-compose-kotlin-fundamentals-practice-problems?hl=es-419#3
 */

fun main() {
    // Fill in the code.
    //De Celsius a Farenheit
    printFinalTemperature(
        27.0,
        "Celsius",
        "Fahrenheit"
    ) { medidaInicial -> ((9 / 5) * medidaInicial + 32) }

    //De Kelvin a Celsius
    printFinalTemperature(300.0, "Kelvin", "Celsius") { it -273.15}

    //De Fahrenheit a Kelvin
    printFinalTemperature(75.0, "Fahrenheit","Kelvin")
    { 5/9 * (it -32) + 273.15 }

}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}