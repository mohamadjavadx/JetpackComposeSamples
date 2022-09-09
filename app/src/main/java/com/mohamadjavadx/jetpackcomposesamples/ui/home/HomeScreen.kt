package com.mohamadjavadx.jetpackcomposesamples.ui.home

import androidx.compose.runtime.Composable
import com.mohamadjavadx.jetpackcomposesamples.ui.navigation.HomeNavGraph
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@HomeNavGraph(start = true)
@Destination
@Composable
fun HomeScreen(
    navigator: DestinationsNavigator,
) {
    HomeScreenContent()
}

@Composable
fun HomeScreenContent() {
    
}