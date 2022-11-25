package com.krachkovsky.socialnetwork.presentation.util

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.krachkovsky.socialnetwork.presentation.login.LoginScreen
import com.krachkovsky.socialnetwork.presentation.main_feed.MainFeedScreen
import com.krachkovsky.socialnetwork.presentation.register.RegisterScreen
import com.krachkovsky.socialnetwork.presentation.splash.SplashScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.rout
    ) {
        composable(Screen.SplashScreen.rout) {
            SplashScreen(navController = navController)
        }
        composable(Screen.LoginScreen.rout) {
            LoginScreen(navController = navController)
        }
        composable(Screen.RegisterScreen.rout) {
            RegisterScreen(navController = navController)
        }
        composable(Screen.MainFeedScreen.rout) {
            MainFeedScreen(navController = navController)
        }
    }
}