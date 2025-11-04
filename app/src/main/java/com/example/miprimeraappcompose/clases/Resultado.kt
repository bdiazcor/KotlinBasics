package com.example.miprimeraappcompose.clases

import android.R
import java.util.Objects

sealed class Resultado {
    data class Exito(val mensaje: String): Resultado()
    data class Error(val mensaje: String): Resultado()
    object Cargando: Resultado()
}

/* ¿Por qué interesa?
Imagina que haces una app que puede estar en tres estados:
- Éxito (todo fue bien)
- Error (algo falló)
- Cargando (aún trabajando)

¿Por qué data class en Exito y Error?
Porque guardan información (datos) que quieres leer luego:
- En Exito, guardas un mensaje como “Todo salió bien”.
- En Error, guardas un mensaje como “No hay internet”.

Además data class proporciona otros extras:
- Te crea solo métodos útiles (toString, equals, etc.).
- Te deja comparar objetos por su contenido (el mensaje), no solo por si son el mismo objeto.
- Si no necesitas guardar nada (como en Cargando), no hace falta mochila → usamos un object (un único valor).

¿Por qué tenerlas dentro de una sealed class? Porque la sealed class solo permite los estado que contiene.
Ventajas:
- En un when, el compilador comprueba que trates todos los casos. Si te olvidas uno, te avisa.
- No se pueden inventar estados nuevos fuera de la sealed class. Más seguridad y orden.
 */
