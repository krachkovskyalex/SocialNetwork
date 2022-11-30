package com.krachkovsky.socialnetwork.presentation.util

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.krachkovsky.socialnetwork.presentation.activity.ActivityScreen
import com.krachkovsky.socialnetwork.presentation.chat.ChatScreen
import com.krachkovsky.socialnetwork.presentation.create_post.CreatePostScreen
import com.krachkovsky.socialnetwork.presentation.login.LoginScreen
import com.krachkovsky.socialnetwork.presentation.main_feed.MainFeedScreen
import com.krachkovsky.socialnetwork.presentation.profile.ProfileScreen
import com.krachkovsky.socialnetwork.presentation.register.RegisterScreen
import com.krachkovsky.socialnetwork.presentation.splash.SplashScreen

@Composable
fun Navigation(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.SplashScreen.rout,
        modifier = Modifier.fillMaxSize()
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
        composable(Screen.ChatScreen.rout) {
            ChatScreen(navController = navController)
        }
        composable(Screen.ActivityScreen.rout) {
            ActivityScreen(navController = navController)
        }
        composable(Screen.ProfileScreen.rout) {
            ProfileScreen(navController = navController)
        }
        composable(Screen.CreatePostScreen.rout) {
            CreatePostScreen(navController = navController)
        }
    }
}