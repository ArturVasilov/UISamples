package com.yandex.ui.samples

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yandex.ui.samples.ui.theme.UISamplesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UISamplesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    val modifier = Modifier.fillMaxSize().padding(innerPadding)
                    // LoveWord(modifier = modifier)
                    // Calculator(modifier = modifier)
                }
            }
        }
    }
}

@Composable
fun LoveWord(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        // TODO
    }
}

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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UISamplesTheme {
        // LoveWord()
        // Calculator()
    }
}