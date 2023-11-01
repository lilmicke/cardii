package com.example.mycardsapp.ui.theme.Screens.Calculator

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.mycardsapp.ui.theme.MyCardsAppTheme
import com.example.mycardsapp.ui.theme.Screens.Intents.IntentScreen


fun Calculator(naveController: NavHostController) {
    println("Welcome to the Simple Calculator")

    while (true) {
        println("Enter an operation (+, -, *, /) or 'q' to quit: ")
        val operation = readLine()

        if (operation == "q") {
            println("Goodbye!")
            break
        }

        if (operation !in setOf("+", "-", "*", "/")) {
            println("Invalid operation. Please enter +, -, *, or /.")
            continue
        }

        println("Enter the first number: ")
        val num1 = readLine()?.toDoubleOrNull()
        if (num1 == null) {
            println("Invalid input. Please enter a valid number.")
            continue
        }

        println("Enter the second number: ")
        val num2 = readLine()?.toDoubleOrNull()
        if (num2 == null) {
            println("Invalid input. Please enter a valid number.")
            continue
        }

        when (operation) {
            "+" -> println("$num1 + $num2 = ${num1 + num2}")
            "-" -> println("$num1 - $num2 = ${num1 - num2}")
            "*" -> println("$num1 * $num2 = ${num1 * num2}")
            "/" -> {
                if (num2 == 0.0) {
                    println("Division by zero is not allowed.")
                } else {
                    println("$num1 / $num2 = ${num1 / num2}")
                }
            }
        }
    }
}








@Preview(showBackground = true)
@Composable
fun ProductScreenPreview(){
    MyCardsAppTheme {
        IntentScreen(naveController = rememberNavController())
    }

}