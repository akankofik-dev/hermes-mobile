package com.hermes.mobile
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val modules = listOf(
        "KANBAN" to Color(0xFFFF6B6B),
        "AGENT" to Color(0xFF4ECDC4),
        "BROWSER" to Color(0xFFFFD93D),
        "PROFILE" to Color(0xFF6BCFFF)
    )
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "HERMES MOBILE",
            fontSize = androidx.compose.ui.unit.TextUnit(28f, androidx.compose.ui.unit.TextUnitType.Sp),
            color = Color(0xFFFFD93D),
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(24.dp))
        modules.forEachIndexed { index, (name, color) ->
            Card(
                colors = CardDefaults.cardColors(containerColor = Color(0xFF0F0C1A)),
                modifier = Modifier.padding(8.dp).width(300.dp).height(60.dp)
            ) {
                Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                    Text(text = name, color = color, fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}
