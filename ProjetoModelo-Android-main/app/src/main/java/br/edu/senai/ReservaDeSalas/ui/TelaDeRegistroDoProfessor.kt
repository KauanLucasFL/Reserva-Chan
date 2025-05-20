/*
    Arquivo: /app/src/main/java/br/edu/senai/projetomodelo/ui/TelaDeRegistroDoProfessor.kt
    Descrição: Tela de cadastro de professores, onde você pode adicionar o componente que desejar.
    Autor: Nome do autor <autor@email.com.br>
    Data: 00/00/0000
*/
package br.edu.senai.ReservaChan.ui

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

/**
 * Tela de cadastro de professores, onde você pode adicionar o componente que desejar.
 * @author Nome do autor <autor@email.com.br>
 */
@Composable
fun TeacherRegistrationScreen(modifier: Modifier) {
    Text("Componente de exemplo, troque aqui pelo componente que desejar")
}

/**
 * Preview da tela de cadastro de professores.
 * @author Nome do autor <autor@email.com.br>
 */
@Preview
@Composable
fun PreviewTeacherRegistrationScreen() {
    TeacherRegistrationScreen(modifier = Modifier)
}
