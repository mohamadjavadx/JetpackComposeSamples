package com.mohamadjavadx.jetpackcomposesamples.ui

import androidx.compose.runtime.Composable
import com.mohamadjavadx.jetpackcomposesamples.ui.home.NavGraphs
import com.mohamadjavadx.jetpackcomposesamples.ui.theme.ComposeTheme
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.rememberNavHostEngine

@Composable
fun ComposeApp() {
    val engine = rememberNavHostEngine()
    val navController = engine.rememberNavController()

    ComposeTheme {
        DestinationsNavHost(
            engine = engine,
            navController = navController,
            navGraph = NavGraphs.root,
            startRoute = NavGraphs.root.startRoute
        )
    }
}