package com.example.akhleshkumar.newsapplication.presentation.navigation
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.akhleshkumar.newsapplication.presentation.screens.DetailsScreen
import com.example.akhleshkumar.newsapplication.presentation.screens.HomeScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavigationItem.HomeScreenNavigationItem.route
    ) {
        composable(NavigationItem.HomeScreenNavigationItem.route) {
            HomeScreen(navController)
        }

        composable(NavigationItem.DetailsScreenNavigationItem.route) {
            val title = it.arguments?.getString("title")
            DetailsScreen(title.toString())
        }
    }
}