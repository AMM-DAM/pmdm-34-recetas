package com.pmdm.recetas.data.mocks

data class RecetaMock(
    val name: String,
    val description: String,
    val chef: String,
    val urlPhoto: String?,
    val likes: Int,
    val liked: Boolean
)
