package com.pmdm.recetas

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.pmdm.recetas.ui.composables.buttonlike.ButtonLikeUiState
import com.pmdm.recetas.ui.features.receta.Receta
import com.pmdm.recetas.ui.features.receta.RecetaViewModel
import com.pmdm.recetas.ui.theme.RecetasTheme
import androidx.lifecycle.viewmodel.compose.viewModel
import com.pmdm.recetas.ui.features.receta.RecetaEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecetasTheme {
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecetaPreview() {

    val recetaViewModel: RecetaViewModel = viewModel()

    RecetasTheme {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Receta(recetaViewModel)
            Spacer(modifier = Modifier.size(20.dp))
            Button(onClick = { recetaViewModel.onRecetaEvent(RecetaEvent.OnRemoteLiked) }) {
                Text(text = "Otro usuario pulsa Like")
            }
        }
    }
}