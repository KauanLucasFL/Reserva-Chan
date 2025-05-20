/*
    Arquivo: /app/src/main/java/br/edu/senai/Reserva-chan/MainActivity.kt
    Descrição: Classe principal do aplicativo.
    Autor: Kauan Lucas Fernandes de Lima  <kauan.lucxs.fl@gmail.com.br>
    Data: 20/05/2025
*/

package br.edu.senai.ReservaChan

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

/**
 * Classe principal do aplicativo.
 * @constructor Cria uma instância da classe MainActivity.
 * @see [ComponentActivity]
 * @see [setContent]
 * @see [enableEdgeToEdge]
 * @author Kauan Lucas Fernandes de Lima  <kauan.lucxs.fl@gmail.com.br>
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ReservaChanTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    HomeScreen(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}