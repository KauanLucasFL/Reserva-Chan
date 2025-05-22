package br.edu.senai.ReservaDeSalas

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.MutableState
import java.time.LocalDateTime

data class ItemParaReserva (
    val id: String,
    val name: String,
    val isReserved: Boolean MutableState  = mutableStateOf(false), // Estado da reserva
    val reservationTime: MutableState<LocalDateTime?> = mutableStateOf(null) // Horário da reserva (pode ser nulo)
)// O ? serve para indicar que varial ou parametro pode ser null