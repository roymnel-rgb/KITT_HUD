package com.example.dora_hud.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dora_hud.ui.theme.Digital7

@Composable
fun NavOverlay(
    milesTillTurn: String = "0.5",
    streetName: String = "towards 166 West",
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.Start
    ) {
        // Distance to Next Turn
        Text(
            text = "$milesTillTurn MI",
            fontFamily = Digital7,
            fontSize = 32.sp,
            color = Color(0xFFFF0000) // Active Red (#FF0000)
        )

        // Street Name Overlay Text
        Text(
            text = streetName,
            fontFamily = Digital7,
            fontSize = 20.sp,
            color = Color(0xFFFF0000), // Active Red (#FF0000)
            modifier = Modifier.padding(top = 4.dp)
        )
    }
}