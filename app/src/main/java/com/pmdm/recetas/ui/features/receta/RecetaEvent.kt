package com.pmdm.recetas.ui.features.receta

sealed interface RecetaEvent {
    data object OnLiked : RecetaEvent
    data object OnRemoteLiked : RecetaEvent
}