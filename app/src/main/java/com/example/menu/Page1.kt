package com.example.menu

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.menu.ui.theme.MenuTheme

@Composable
fun Page1(modifier: Modifier = Modifier,
          navController: NavController

  ) {
    Column(modifier = Modifier){

        Text(text = "Page 1 - Probando")
        Button(onClick = {
        navController.navigate("page2")
        }
    ) {
            Text(text = "Ir a la Page 2")
        }


    }
}

@Preview(showBackground = true)
@Composable
fun Page1Preview() {
    MenuTheme {
        val navController = rememberNavController()
        Page1(navController = navController)
    }
}