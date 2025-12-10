package com.example.scaffoldnavigation.ui.screens

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.padding
import androidx.navigation.NavController
import com.example.scaffoldnavigation.ui.components.ScreenTopBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SettingsScreen(navController: NavController) {
    Scaffold(
        topBar = { ScreenTopBar("Settings", navController)},
    ) { innerPadding ->
        Text(
            text = "Settings Screen",
            modifier = Modifier.padding(innerPadding).padding(16.dp),
            fontSize = 20.sp
        )
    }
}