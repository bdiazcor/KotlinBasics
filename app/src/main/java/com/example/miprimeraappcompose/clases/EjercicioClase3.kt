package com.example.miprimeraappcompose.clases

fun main() {
    val exito1: Resultado = Resultado.Exito("Todo salió bien")
    val exito2: Resultado = Resultado.Exito("El fichero se cargó")
    val error1: Resultado = Resultado.Error("Fallo 323")
    val error2: Resultado = Resultado.Error("Error 008")
    val caso3: Resultado = Resultado.Cargando

    println(mensaje(exito1))
    println(mensaje(exito2))
    println(mensaje(error1))
    println(mensaje(error2))
    println(mensaje(caso3))

}

//Forma 1
fun mensaje(r: Resultado): String {
    val msg: String
    when (r) {
        is Resultado.Exito -> msg =
            r.mensaje //Con is se accede a las propiedades de la clase. Sin is cuando es un objeto (singleton)
        is Resultado.Error -> msg = r.mensaje
        Resultado.Cargando -> msg = "Cargando..."
    }
    return msg
}

//Forma 2
fun mensaje2(r: Resultado): String {
    val msg = when (r) {
        is Resultado.Exito -> r.mensaje
        is Resultado.Error -> r.mensaje
        Resultado.Cargando -> "Cargando..."
    }
    return msg
}

//Forma 3
fun mensaje3(r: Resultado): String {
    return when (r) {
        is Resultado.Exito -> r.mensaje
        is Resultado.Error -> r.mensaje
        Resultado.Cargando -> "Cargando..."
    }
}

//Forma4
fun mensaje4(r: Resultado): String = when (r) {
    is Resultado.Exito -> r.mensaje
    is Resultado.Error -> r.mensaje
    Resultado.Cargando -> "Cargando..."
}


