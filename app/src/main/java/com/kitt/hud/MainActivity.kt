package com.kitt.hud

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Display our temporary HUD startup screen
            KittHudStartupScreen()
        }
    }
}

@Composable
fun KittHudStartupScreen() {
    // Fill the screen with a deep black retro dashboard background
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        // Temporary welcome text in bright red K.I.T.T. style
        Text(
            text = "K.I.T.T. HUD SYSTEM ONLINE",
            color = Color(0xFFFF0000),
            fontSize = 24.sp
        )
    }
}
