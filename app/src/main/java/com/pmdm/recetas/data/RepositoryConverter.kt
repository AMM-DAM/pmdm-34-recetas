package com.pmdm.recetas.data

import com.pmdm.recetas.data.mocks.RecetaMock
import com.pmdm.recetas.models.Receta

fun RecetaMock.toReceta() = Receta(
    name = name,
    description = description,
    chef = chef,
    urlPhoto = urlPhoto,
    likes = likes,
    liked = liked
)

fun Receta.toRecetaMock() = RecetaMock(
    name = name,
    description = description,
    chef = chef,
    urlPhoto = urlPhoto,
    likes = likes,
    liked = liked
)