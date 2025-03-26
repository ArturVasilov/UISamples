package com.yandex.ui.samples

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun Calculator(modifier: Modifier = Modifier) {
    val displayColor = Color(0xFFFFFFFF)
    val operationColor = Color(0xFF4285F4)
    val functionColor = Color(0xFF5F6368)
    val numberColor = Color(0xFF202124)
    val buttonBackground = Color(0xFFFFFFFF)

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(12.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Display(
            displayColor = displayColor,
            textPrimaryColor = numberColor,
            textSecondaryColor = functionColor
        )
        Spacer(modifier = Modifier.height(16.dp))
        Buttons(
            operationColor = operationColor,
            functionColor = functionColor,
            numberColor = numberColor,
            buttonBackground = buttonBackground
        )
    }
}

@Composable
fun Display(
    displayColor: Color,
    textPrimaryColor: Color,
    textSecondaryColor: Color
) {
    // TODO
}

@Composable
fun Buttons(
    operationColor: Color,
    functionColor: Color,
    numberColor: Color,
    buttonBackground: Color
) {
    // TODO
}