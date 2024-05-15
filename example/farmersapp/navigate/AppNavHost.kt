package com.example.farmersapp.navigate

//import ViewProductsScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.farmersapp.screens.Login.LoginScreen
import com.example.farmersapp.screens.Register.RegisterScreen
import com.example.farmersapp.screens.Splash.SplashScreen
//import com.example.farmersapp.screens.products.ViewProductsScreen
//import com.example.farmersapp.ui.theme.screens.products.ViewUploadsScreen
import com.example.farmersapp.ui.theme.screens.home.HomeScreen
import com.example.farmersapp.ui.theme.screens.pay.PayScreen
import com.example.farmersapp.ui.theme.screens.products.AddProductsScreen

/*
import com.example.farmersapp.ui.theme.screens.home.HomeScreen
import com.example.farmersapp.ui.theme.screens.pay.PayScreen
import com.example.farmersapp.ui.theme.screens.products.ViewProductsScreen2
*/

@Composable
fun AppNavHost(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController(), startDestination: String= ROUTE_SPLASH) {


    NavHost(
        navController = navController,
        modifier = Modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_HOME) {
            HomeScreen(navController = navController)
        }
        composable(ROUTE_LOGIN) {
            LoginScreen(navController = navController)
        }
        composable(ROUTE_REGISTER) {
            RegisterScreen(navController = navController)
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController = navController)
        }
        composable(ROUTE_ADD_PRODUCTS){
            AddProductsScreen(navController = navController)
        }
//        composable(ROUTE_VIEW_PRODUCTS){
//            ViewProductsScreen(navController = navController)
//        }
//        composable(ROUTE_VIEW_PRODUCTS2){
//            ViewProductsScreen(navController = navController)
////        }
//        composable(ROUTE_VIEW_UPLOADS){
//            ViewUploadsScreen(navController = navController)
//        }

        composable(ROUTE_PAY) {
            PayScreen(navController = navController)

//        composable(ROUTE_UPDATE_PRODUCTS +"/{id}"){
//           passedData ->
//            UpdateProductsScreen(navController.passedData.arguments?.getString("id")!!)
//        }
//    }
        }}}
