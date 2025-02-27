package com.example.akhleshkumar.newsapplication.presentation.navigation

sealed class NavigationItem(val route: String) {
    object HomeScreenNavigationItem : NavigationItem("home_screen")
    object DetailsScreenNavigationItem : NavigationItem("details_screen/{title}")
}