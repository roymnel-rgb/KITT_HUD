package com.example.dora_hud

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dora_hud.ui.NavOverlay
import com.example.dora_hud.ui.theme.Digital7

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KittHudScreen()
        }
    }
}

@Composable
fun KittSpeedometer(
    speed: String = "055",
    modifier: Modifier = Modifier
) {
    Text(
        text = speed,
        fontFamily = Digital7,
        fontSize = 64.sp,
        fontWeight = FontWeight.Bold,
        color = Color(0xFFFF0000), // Active Red (#FF0000)
        modifier = modifier
    )
}

@Composable
fun KittHudScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        contentAlignment = Alignment.Center
    ) {
        // Background HUD Graphic
        Image(
            painter = painterResource(id = R.drawable.ic_kitteh_hud),
            contentDescription = "KITT HUD Frame",
            modifier = Modifier.fillMaxSize()
        )

        // Speedometer Display
        KittSpeedometer(
            speed = "055"
        )

        // Navigation Text Overlay
        NavOverlay(
            milesTillTurn = "0.5",
            streetName = "towards 166 West",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .padding(top = 40.dp, end = 40.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun KittHudPreview() {
    KittHudScreen()
}