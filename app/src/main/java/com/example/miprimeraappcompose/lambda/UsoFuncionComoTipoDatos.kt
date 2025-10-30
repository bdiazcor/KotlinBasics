package com.example.miprimeraappcompose.lambda

fun main() {

    //3) Tras crear la función treat(), la llamamos desde la función principal. Quita comentarios
    // del código y ejecuta tras 2)
    //treat()

    //5) Tras crear la función trikOrTreat(), creamos las variables trickFuncion y treatFuncion en la función principal
    //Quita comentario del código y ejecuta tras 4)
    //val trickFunction = trickOrTreat(true)
    //val treatFunction = trickOrTreat(false)

    //Llamamos a trickFunction y treatFuncion
    //println("Truco")
    //trickFunction3()
    //println("Trato")
    //treatFunction()


    //7) Tras incluir extraTreat como parámetro de la función trickOrTreat(),
    // Creamos las lambdas que le vamos a pasar (coins y cupcake)

    val coins: (Int) -> String = { quantity -> "$quantity euros" }
    val cupcake: (Int) -> String = { "Have a Cupcake!" }

    /*** En la función coins(), el parámetro que recibe se llama quantity pero se podría nombrar
    de cualquier forma, siempre que el nombre del parámetro "quantity" y la variable en la cadena "$quantity"
    sean iguales
    En la función cupcake no es necesario incluir el parámetro ni -> ya que no se usan. Es
    un texto fijo ***/

    //Invocamos a la función trickOrTreat. Quita comentarios del código y ejecuta tras 5)
    //val trickFunction = trickOrTreat(false, coins)
    //val treatFunction = trickOrTreat(true, cupcake)
    //println("Truco")
    //trickFunction()
    //println("Trato")
    //treatFunction()

    //Invocamos a a la función trickOrTreat con coins o cupcake solo cuando aplica
    println("Truco")
    val trickFunction = trickOrTreat(true, null)
    trickFunction()
    println("Trato: dinero")
    val treatFunction = trickOrTreat(false, coins)
    treatFunction()
    println("Trato: madalenas")
    val treatFunction1 = trickOrTreat(false, cupcake)
    treatFunction1()
}

/***** Kotlin es fuertemente tipado e infiere el tipo cuando asignas un valor a una variable.
Pero si queremos especificar el tipo de parámetro de función o el tipo de datos que se
muestra en una espreción lambda esta es la sintaxis:
(parámetros (opcional)) -> tipo del valor de retorno (Unit, Int, etc)
El tipo de datos de la variable trick2 sería () -> Unit
Por ejemplo, si tienes una función que toma dos parámetros Int y muestra un Int, el tipo de
datos será: (Int, Int) -> Int
 *****/

//1) Función asignada a una variable. Kotlin infiere el tipo
val trick3 = { println("No treat!") }

//2) Declaramos una variable treat como () -> Unit explícitamente.
val treat: () -> Unit = { println("Have a treat!") }

/**** Usamos una función como tipo de datos que devuelve un resultado. Incluso puedes devolver una función
Sintaxis:
fun nombre_función() : tipo_que_devuelve {
    cuerpo_de_la_función
    return nombre_función
}
 ******/

//4) Creamos una función trickOrTreat que acepta un parámente isTrick de tipo Booleano y devuelve
//una funcion de tipo: () -> Unit
//Quita comentarios para probar el devolver una función desde otra función

//fun trickOrTreat(isTrick: Boolean): () -> Unit {
//    if(isTrick==true) {
//        return trick3
//    } else {
//        return treat
//    }
//}

/***** Se puede usar una función como argumento de otra
Cuando declarar funciones como parámetros, los parámetros de la "función parámetro" no se etiquetan.
Sólo se indica el tipo de dato
Sintaxis: (Tipo_dato1, Tipo_dato2) -> Tipo_dato3
Cuando se escribe una expresión lambda para una función que toma un parámetro, los parámetros reciben nombres
en el orden en que ocurren. Los nombres de los parámetros se muestran después de las llaves de apertura
y cada nombre está separado por un coma. Una flecha (->) separa los nombres de los parámetros del cuerpo
de la función. Sintaxis:

val nombre_función = { parámetro1, parámetro2 -> cuerpo_función }

 *****/

//6) Actualizamos la función trickOrTreat para que tome una función como parámetro de tipo:
//(Int) -> String
//fun trickOrTreat(isTrick: Boolean, extraTreat: (Int) -> String):()-> Unit {
//    if(isTrick==true) {
//        return trick3
//    } else {
//        println(extraTreat(5)) //Ahora en la función main hay que definir una lambda para pasar como parámetro a trickOrTreat
//        return treat
//    }
//}

/*** Al igual que otros tipos de datos, se pueden declarar los tipos de funciones como anulables.
En estos casos, una variable podría contener una función o podría ser null.
Para declarar una función como anulable, encierra el tipo de función entre paréntesis seguido de
un símbolo ? fuera del paréntesis de cierre.
Por ejemplo, si deseas que el tipo () -> String sea anulable, decláralo como un
tipo (() -> String)?.
La sintaxis es: (( parametro (opcional) -> tipo_que_devuelve)?
 */

//8) Hacemos que la función lambda extraTreat: (Int) -> String sea anulable:
// extraTreat: ((Int) -> String)? Así no será necesario pasar siempre un parámetro extraTreat en el
// caso de trick que no tiene sentido.
fun trickOrTreat(isTrick: Boolean, extraTreat: ((Int) -> String)?): () -> Unit {
    if (isTrick) {
        return trick3
    } else {
        if (extraTreat != null) {
            println(extraTreat(5))
        }
        return treat

    }
}




