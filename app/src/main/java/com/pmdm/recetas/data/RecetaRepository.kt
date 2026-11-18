package com.pmdm.recetas.data

import com.pmdm.recetas.data.mocks.RecetaDaoMock
import com.pmdm.recetas.models.Receta

class RecetaRepository {
    val dao = RecetaDaoMock()

    fun get() = dao.get().toReceta()
    fun updateReceta(recetaRemota: Receta) =
        dao.updateReceta(recetaRemota.toRecetaMock())
}