package com.example.dora_hud.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.dora_hud.R

// Custom Digital-7 Italic Font
val Digital7 = FontFamily(
    Font(R.font.digital_7_italic, FontWeight.Normal)
)

// Set of Material typography styles using Digital-7
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = Digital7,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)