package com.example.miprimeraappcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun Greeting2(name: String, onClick: () -> Unit) {
    Button(onClick = onClick) {
        Text("Hola $name")
    }
}

@Composable
fun Pantalla() {
    var msg by remember { mutableStateOf("") }

    Column (modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Greeting2("Bea") { msg="Saludo hecho" }
        if (msg.isNotEmpty()) {
            Text(msg)
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview2() {
    Pantalla()
}