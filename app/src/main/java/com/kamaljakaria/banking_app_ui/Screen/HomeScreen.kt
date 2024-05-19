package com.kamaljakaria.banking_app_ui.Screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.zIndex

@Composable
fun HomePage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFC0AFF4))
    ) {
        Column {
            Spacer(modifier = Modifier.height(80.dp))
            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Transaction()  // Place Transaction first
                SendMoney()    // Place SendMoney second to ensure it's on top
            }
        }
    }
}

@Composable
fun SendMoney() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(700.dp)
            .offset(y = 310.dp) // Adjust this offset to place it over the Transaction box
            .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
            .background(Color(0xFFFFFFFF))  // Adjusted color
            .zIndex(1f)  // Ensure SendMoney is on top
    ) {
        // Your content here
    }
}

@Composable
fun Transaction() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .offset(y = 140.dp)// Adjust the height to be longer to extend under SendMoney
            .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
            .background(Color(0xFFEDFB8B))
            .zIndex(0f)  // Ensure Transaction is below
            .padding(top = 100.dp) // Padding to allow for the overlap
    ) {
        // Your content here
    }
}
