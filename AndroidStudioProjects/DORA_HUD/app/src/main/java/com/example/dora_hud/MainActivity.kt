package com.example.dora_hud

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Main screen background set to pitch black for HUD transparency
            KittHudScreen()
        }
    }
}

@Composable
fun KittHudScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black), // Dark background for glass projection
        contentAlignment = Alignment.Center
    ) {
        KittSpeedometer(speed = "055")
    }
}

@Composable
fun KittSpeedometer(speed: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Red digital speed readout
        Text(
            text = speed,
            color = Color(0xFFFF0000), // Glowing K.I.T.T. Red
            fontSize = 72.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace // Monospace gives a retro digital segment look
        )
        Text(
            text = "MPH",
            color = Color(0xCCFF0000), // Slightly lower opacity label
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium,
            fontFamily = FontFamily.Monospace
        )
    }
}

@Preview(showBackground = true, widthDp = 800, heightDp = 400)
@Composable
fun KittHudPreview() {
    KittHudScreen()
}