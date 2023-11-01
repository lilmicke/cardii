package com.example.mycardsapp.ui.theme.Screens.BmiCalc

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.mycardsapp.ui.theme.MyCardsAppTheme
import com.example.mycardsapp.ui.theme.Screens.Intents.IntentScreen


fun BmiCal(){}





@Preview(showBackground = true)
@Composable
fun ProductScreenPreview(){
    MyCardsAppTheme {
        IntentScreen(naveController = rememberNavController())
    }
}