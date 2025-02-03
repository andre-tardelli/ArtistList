package com.devspacecomposeinit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.devspacecomposeinit.ui.theme.ComposeInitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeInitTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ArtistCard()
                }
            }
        }
    }
}

@Composable
fun ArtistCard() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text("Alfred Sisley")
        Text("3 minutes ago")
    }
}

data class artist(
        val name: String,
        val lastSeenOnline: String
)

@Preview(showBackground = true)
@Composable
fun ArtistCardPreview() {
    ComposeInitTheme {
        ArtistCard()
    }
}