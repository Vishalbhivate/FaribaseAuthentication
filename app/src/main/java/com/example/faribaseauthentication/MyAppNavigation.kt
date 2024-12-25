package com.example.faribaseauthentication

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.faribaseauthentication.pages.Homepage
import com.example.faribaseauthentication.pages.Loginpage
import com.example.faribaseauthentication.pages.Singuppage

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier,authViewModel: AuthViewModel) {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "login", builder = {
        composable("login") {
            Loginpage(modifier,navController,authViewModel)
        }
        composable("singup") {
            Singuppage(modifier,navController,authViewModel)
        }
        composable("home") {
            Homepage(modifier,navController,authViewModel)
        }
    })
}