package com.pmdm.recetas.ui.features.receta

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import com.pmdm.recetas.R
import com.pmdm.recetas.ui.composables.buttonlike.ButtonLike
import com.pmdm.recetas.ui.composables.buttonlike.ButtonLikeUiState

@Composable
fun Receta(recetaViewModel: RecetaViewModel = viewModel()) {
    ElevatedCard(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        )
    ) {
        Column {
            AsyncImage(
                model = recetaViewModel.recetaUiState.urlPhoto,
                contentDescription = recetaViewModel.recetaUiState.name,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(200.dp)
                    .clip(shape = CardDefaults.shape)
            )

            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier.padding(8.dp)
            ) {
                Text(
                    recetaViewModel.recetaUiState.name,
                    style = MaterialTheme.typography.headlineSmall
                )
                Text(recetaViewModel.recetaUiState.description)

                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(recetaViewModel.recetaUiState.chef)
                    ButtonLike(
                        liked = recetaViewModel.recetaUiState.liked,
                        likes = recetaViewModel.recetaUiState.likes,
                        onLiked = { recetaViewModel.onRecetaEvent(RecetaEvent.OnLiked) }
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun RecetaPreview() {
    Receta()
}