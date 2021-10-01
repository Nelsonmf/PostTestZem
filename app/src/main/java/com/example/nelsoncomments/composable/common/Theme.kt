package com.example.nelsoncomments.composable.common

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Primary = Color(0xFF106FA9)
val DarkPrimary = Color(0xFF59ACF5)
val BorderColor = Color(0xFFDBDBDB)
val PrimaryTextColor = Color(0xFF121212)
val SecondaryTextColor = Color(0xFF616161)
val SelectedPage = Color(0xFFF05541)
val GreenTextColor = Color(0xFF00804C)
val ColorAccent = Color(0xFF106FA9)
val LightGray50Color = Color(0x0A000000)
val DividerColor = Color(0xFFE5E5E5)
val ActiveTextColor = Color(0xFF106FA9)

val DarkColorPalette = darkColors().copy(
    primary = DarkPrimary,
    primaryVariant = Primary,
    secondary = DarkPrimary,
    secondaryVariant = DarkPrimary,
    background = Color.Black,
    surface = Color.Black,
    onPrimary = Color.White,
    onSecondary = Color.Black,
)

val LightColorPalette = lightColors().copy(
    primary = Primary,
    primaryVariant = Color(0xFF09409B),
    secondary = Primary,
    secondaryVariant = Primary,
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
)

@Composable
fun AppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) =
    MaterialTheme(
        colors = if (darkTheme) DarkColorPalette else LightColorPalette,
        typography = Typography,
    )