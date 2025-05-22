/*
    Arquivo: /app/src/main/java/br/edu/senai/Reserva-chan/MainActivity.kt
    Descrição: Classe principal do aplicativo.
    Autor: Kauan Lucas Fernandes de Lima  <kauan.lucxs.fl@gmail.com.br>
    Data: 20/05/2025
*/

package br.edu.senai.ReservaDeSalas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import br.edu.senai.ReservaChan.ui.HomeScreen
import br.edu.senai.ReservaChan.ui.theme.ReservaChanTheme
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import java.time.LocalDateTime

import br.edu.senai.ReservaDeSalas.Classes
import br.edu.senai.ReservaDeSalas.ui

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ReservaChanTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                            color = MaterialTheme . colorScheme . background
                ) { innerPadding ->
                    HomeScreen(modifier = Modifier.padding(innerPadding))

                }

            }
        }
    }
}