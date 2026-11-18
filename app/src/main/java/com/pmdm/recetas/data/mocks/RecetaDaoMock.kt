package com.pmdm.recetas.data.mocks

class RecetaDaoMock {
    private var receta =
        RecetaMock(
            name = "Magdalenas de la abuela",
            description = "Fabulosas magdalenas con pepitas de chocolate y un suave sabor a naranja.",
            chef = "Carlos Arguiñano",
            urlPhoto = "http://10.0.2.2/recetas/magdalenas.png",
            likes = 8,
            liked = false
        )

    fun get(): RecetaMock = receta
    fun updateReceta(recetaRemota: RecetaMock) {
        receta = recetaRemota
    }
}
