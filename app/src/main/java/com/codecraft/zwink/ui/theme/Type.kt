package com.codecraft.zwink.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.codecraft.zwink.R

private val Quicksand = FontFamily(
    Font(R.font.quicksand_light, FontWeight.W300),
    Font(R.font.quicksand_regular),
    Font(R.font.quicksand_medium, FontWeight.W500),
    Font(R.font.quicksand_semibold, FontWeight.W600),
    Font(R.font.quicksand_bold, FontWeight.W700)
)

val Typography = Typography(
    bodyMedium = TextStyle(
        fontFamily = Quicksand,
        fontWeight = FontWeight.W400,
        fontSize = 16.sp,
        lineHeight = 22.sp
    ),
    titleMedium = TextStyle(
        fontFamily = Quicksand,
        fontWeight = FontWeight.W700,
        fontSize = 22.5.sp,
        lineHeight = 27.5.sp
    )
)