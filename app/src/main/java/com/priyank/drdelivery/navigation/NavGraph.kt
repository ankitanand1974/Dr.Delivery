package com.priyank.drdelivery.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.priyank.drdelivery.authentication.presentation.AuthenticationScreen
import com.priyank.drdelivery.feature_track_pacakges.presentation.Greeting

@Composable
fun SetupNavGraph(
    navController: NavHostController,
    startDestination: String
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(route = Screen.Authentication.route) {
            val navController = rememberNavController()
            AuthenticationScreen(navHostController = navController)
        }
        composable(route = Screen.ShipmentDetail.route) {
            Greeting()
        }
    }
}
