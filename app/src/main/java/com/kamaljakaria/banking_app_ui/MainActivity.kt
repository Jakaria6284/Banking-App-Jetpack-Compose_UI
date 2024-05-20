package com.kamaljakaria.banking_app_ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kamaljakaria.banking_app_ui.Screen.HomePage
import com.kamaljakaria.banking_app_ui.ui.theme.Banking_App_UiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Banking_App_UiTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                     HomePage()
                }
            }
        }
    }
}



@Composable
fun image()
{
    Image(painter = painterResource(id = R.drawable.profile_pic), contentDescription =null,
        modifier = Modifier.clip(shape = CircleShape)
            .size(40.dp,40.dp)

    )
}
@Composable
fun image2(item:branddata)
{
    Image(painter = painterResource(id = item.image), contentDescription =null,
        modifier = Modifier.clip(shape = CircleShape)
            .size(40.dp,40.dp)
            .background(Color(0x97FFFFFF))

    )
}



