/*
    Arquivo: /app/src/main/java/br/edu/senai/ReservaChan/ui/TelaPrincipal.kt
    Descrição: Tela inicial do aplicativo, onde você pode adicionar o componente que desejar.
    Autor: Nome do autor <autor@email.com.br>
    Data: 00/00/0000
*/
package br.edu.senai.ReservaChan.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * Tela inicial do aplicativo, onde você pode adicionar o componente que desejar.
 * @author Nome do autor <autor@email.com.br>
 */
@Composable
fun HomeScreen(modifier: Modifier) {
    Text("Componente de exemplo, troque aqui pelo componente que desejar")
}

/**
 * Preview da tela inicial do aplicativo.
 * @author Nome do autor <autor@email.com.br>
 */
@Preview
@Composable
fun PreviewHomeScreen () {
    HomeScreen(modifier = Modifier)
}
