package com.pmdm.recetas.models

data class Receta(
    val name: String,
    val description: String,
    val chef: String,
    val urlPhoto: String?,
    val likes: Int,
    val liked: Boolean
)