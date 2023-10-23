package com.santotomas.actividadmanejoversiones

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.santotomas.actividadmanejoversiones.ui.theme.ActividadManejoVersionesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ActividadManejoVersionesTheme {
                // A surface container using the 'background' color from the theme
                AbrirMapa()
            }
        }
    }

    private fun AbrirMapa(){
        Intent (this,ActivityMaps::class.java).also{
            startActivity(it)
        }
    }
}

