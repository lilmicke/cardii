package com.example.mycardsapp.Navigatons

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mycardsapp.ui.theme.Screens.Home.HomeScreen


@Composable
fun AppNavHost(
    modifier :Modifier= Modifier,
    navController: NavHostController= rememberNavController(),
    startDestination:String= ROUTES_HOME
){
    NavHost(navController = navController
        ,modifier = Modifier
        ,startDestination = startDestination ) {

        composable(ROUTES_HOME) {
            HomeScreen(navController=navController)
        }
        composable(ROUTES_CALCULATOR) {
            HomeScreen(navController = navController)

        }
        composable(ROUTES_BMICALC){
            HomeScreen(navController=navController)
        }
        composable(ROUTES_CALCULATOR){
            HomeScreen(navController=navController)
        }
        composable(ROUTES_INTENTS){
            HomeScreen(navController=navController)
        }
    }
}