package com.pmdm.recetas.ui.features.receta

import com.pmdm.recetas.models.Receta

data class RecetaUiState(
    val name: String = "Lorem ipsum",
    val description: String = "consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua",
    val chef: String = "Ut enim ad",
    var urlPhoto: String? = null,
    val likes: Int = 0,
    val liked: Boolean = false
)

fun RecetaUiState.toReceta() = Receta(
    name = name,
    description = description,
    chef = chef,
    urlPhoto = urlPhoto,
    likes = likes,
    liked = liked
)

fun Receta.toRecetaUiState() = RecetaUiState(
    name = name,
    description = description,
    chef = chef,
    urlPhoto = urlPhoto,
    likes = likes,
    liked = liked
)
