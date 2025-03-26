package com.yandex.ui.samples

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

private val duckPixels = listOf(
    listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
    listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
    listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
    listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
    listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
    listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
    listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
    listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
    listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
    listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
    listOf(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0),
)

@Composable
fun PixelDuck(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.background(Color.White),
        contentAlignment = Alignment.Center
    ) {
        Column {
            duckPixels.forEach { pixelRow ->
                Row {
                    pixelRow.forEach { pixel ->
                        Box(
                            modifier = Modifier
                                .size(20.dp)
                                .background(pixel.codeToColor())
                        )
                    }
                }
            }
        }
    }
}

private fun Int.codeToColor(): Color = when (this) {
    0 -> Color.Transparent
    1 -> Color.Black
    2 -> Color.Yellow
    3 -> Color(0xFFFBC02D) // Dark-yellow
    4 -> Color(0xFFFF9800) // Orange
    else -> Color.Transparent
}