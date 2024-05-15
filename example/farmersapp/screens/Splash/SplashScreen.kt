package com.example.farmersapp.screens.Splash

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.farmersapp.R
import com.example.farmersapp.navigate.ROUTE_LOGIN
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController: NavHostController) {
    Column (modifier = Modifier
        .fillMaxSize()
        .paint(painterResource(id = R.drawable.img3), contentScale = ContentScale.FillBounds)
//
//        .paint(painterResource(id = R.drawable.img4), contentScale = ContentScale.FillBounds), horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center

    ) {
        val coroutine = rememberCoroutineScope()
        val launch = coroutine.launch { delay(3000) }
        navController.navigate(ROUTE_LOGIN)
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SplashScreenPreview(){
    SplashScreen(navController = rememberNavController())
}