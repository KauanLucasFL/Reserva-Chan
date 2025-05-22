/*
    Arquivo: /app/src/main/java/br/edu/senai/ReservaChan/ui/TelaPrincipal.kt
    Descrição: Tela inicial do aplicativo, onde você pode adicionar o componente que desejar.
    Autor: Nome do autor <autor@email.com.br>
    Data: 00/00/0000
*/
package br.edu.senai.ReservaDeSalas

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.MutableState
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle

@Composable
fun HomeScreen(modifier: Modifier) {
    Text("Salas Disponiveis")

    val items = remember {
        listOf(
            ReservableItem(id = "1", name = "Sala de Informática 1"),
            ReservableItem(id = "2", name = "Sala de Informática 2"),
            ReservableItem(id = "3", name = "Sala de Informática 3"),

        )
    }

    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Itens para Reserva",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        items.forEach { item ->
            CardReservable(item = item)
        }
    }
}


@Preview (showBackground = true)
@Composable
fun PreviewHomeScreen() {
    HomeScreen(modifier = Modifier)
}

@Composable
fun CardReservable(item: ItemParaReserva) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding
                elevation = CardDefaunts . cardElevation (defauntElevetion = 4 dp)

    ) {
        Column(
            modifier = Modifier.padding(16 dp)
                    horizontalAlignment = Alignment . CenterHorizontally
        ) {
            Text(
                text = item.name,
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(bottom = 8 dp)
            )
            if (item.isReservad.value) { // Verifica o valor do MutableState
                Text(
                    text = "Reservado!", // Aparece na tela
                    color = Color.Green,
                    style = MaterialTheme.typography.bodyLarge,
                    modifier = Modifier.padding(bottom = 4 dp)
                )
                item.reservationTime.value?.let { time -> //Usa .let para lidar com nulos
                    Text(
                        text = "Reservado as: ${time.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM))}",
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
                Spacer(modifier = Modifier.heigth(8 dp))
                Button(
                    onClick = {
                        item.isReserved.value = false // Tá cancelando a reserva
                        item.reservetionTime.value = null // Limpa o horário
                    },
                    modifier = Modifier.filllmaxWidth()

                ) {
                    Text("Reservar")
                }
            } else {
                Button(
                    onClick = {
                        item.isReserved.value = true // marca como reservado
                        item.reservationTime.value = LocalDateTime.now() // Define o horário atual
                    },
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text("Reservar")
                }
            }
        }
    }
}

@preview(shadowBackgroud = true)
@composable
fun PreviewCardReservable() {
    MaterialTheme {
        CardReservable(
            item = ItemParaReserva(
                id = "Sala do Professor Miguel"
                        name = "Sala de Informática 1"
                        isReserved = remember { mutableStateOf(false) },
                reservationTime = remember { mutableStateOf(null) }
            )
        )
    }
}

@preview(shadowBackgroud = true)
@composable
fun PreviewCardReservable() {
    MaterialTheme {
        CardReservable(
            item = ItemParaReserva(
                id = "2"
                        name = "Sala de Informática 2"
                        isReserved = remember { mutableStateOf(true) },
                reservationTime = remember { mutableStateOf(LocalDateTime.now()) }
            )
        )
    }
}
