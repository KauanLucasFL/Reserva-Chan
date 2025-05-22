/*
    Arquivo: /app/src/main/java/br/edu/senai/projetomodelo/ui/VizualizacaoDeChaves.kt
    Descrição: Tela de visualização de chaves, onde você pode adicionar o componente que desejar.
    Autor: Nome do autor <autor@email.com.br>
    Data: 00/00/0000
*/
package br.edu.senai.ReservaChan.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.MutableState
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme


@Composable
fun KeyViewScreen(modifier: Modifier) {
    Text("Componente de exemplo, troque aqui pelo componente que desejar")
}


@Preview
@Composable
fun PreviewKeyViewScreen() {
    KeyViewScreen(modifier = Modifier)
}
