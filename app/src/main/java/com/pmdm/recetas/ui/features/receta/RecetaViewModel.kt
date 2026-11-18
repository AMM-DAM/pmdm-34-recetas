package com.pmdm.recetas.ui.features.receta

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.pmdm.recetas.data.RecetaRepository

class RecetaViewModel : ViewModel() {
    var recetaUiState by mutableStateOf(RecetaRepository().get().toRecetaUiState())

    fun onLiked() {
        recetaUiState = recetaUiState.copy(
            liked = !recetaUiState.liked,
            likes = recetaUiState.likes + if (recetaUiState.liked) -1 else 1
        )
    }

    fun onRemoteLiked() {
        recetaUiState = recetaUiState.copy(
            likes = recetaUiState.likes + 1
        )
    }

    fun onRecetaEvent(evento: RecetaEvent) {
        when (evento) {
            RecetaEvent.OnLiked -> onLiked()
            RecetaEvent.OnRemoteLiked -> onRemoteLiked()
        }
    }
}