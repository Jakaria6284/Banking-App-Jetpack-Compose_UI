package com.kamaljakaria.banking_app_ui.Screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.zIndex
import com.kamaljakaria.banking_app_ui.Data
import com.kamaljakaria.banking_app_ui.branddata
import com.kamaljakaria.banking_app_ui.getAllDataproduct
import com.kamaljakaria.banking_app_ui.getAllImage
import com.kamaljakaria.banking_app_ui.image
import com.kamaljakaria.banking_app_ui.image2

@Composable
fun HomePage() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFC0AFF4))
    ) {
        Column {

            Box(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Header()

               Transaction()  // Place Transaction first
                SendMoney()    // Place SendMoney second to ensure it's on top
            }
        }
    }
}

@Composable
fun Header()
{
    Column (
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Row (modifier = Modifier.padding(16.dp)){
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Filled.Menu, contentDescription =null,tint = Color.Black )
            }
            Spacer(modifier = Modifier.weight(0.7f))
            IconButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Filled.Notifications, contentDescription =null, tint = Color.Black )
            }
            Spacer(modifier = Modifier.weight(0.01f))
           image()



        }

        Text(text = "Bank Account",
            style = TextStyle(
                fontSize = 16.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Black
            )

        )
        Spacer(modifier = Modifier.height(7.dp))

        Text(text = "$954,58 USD",
            style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Black
            )

        )
        Spacer(modifier = Modifier.height(7.dp))

        Text(text = "Update 15 December 2023",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Black
            )

        )
    }
}

@Composable
fun SendMoney() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .offset(y = 400.dp) // Adjust this offset to place it over the Transaction box
            .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
            .background(Color(0xFFFFFFFF))  // Adjusted color
            .zIndex(1f)  // Ensure SendMoney is on top
    ) {
       Column (
           modifier = Modifier.padding(start = 20.dp)
       ){
           Text(text = "Transactions",
               style = TextStyle(
                   fontSize = 22.sp,
                   fontWeight = FontWeight.Medium,
                   color = Color.Black
               )
               ,
               modifier = Modifier.padding(start = 20.dp, top = 20.dp)

           )
           Spacer(modifier = Modifier.height(20.dp))
           lazyColum()


       }
    }
}

@Composable
fun Transaction() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .offset(y = 220.dp)// Adjust the height to be longer to extend under SendMoney
            .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
            .background(Color(0xFFEDFB8B))
            .zIndex(0f)  // Ensure Transaction is below
            .padding(start = 16.dp)// Padding to allow for the overlap
    ) {
        Column (

        ){
            Text(text = "Send Money To",
                style = TextStyle(
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Medium,
                    color = Color.Black
                )
                ,
                modifier = Modifier.padding(start = 20.dp, top = 20.dp)

            )

            Row (){
                lazyRow()
                Spacer(modifier = Modifier.width(20.dp))
                addButton()
            }
        }


    }
}

@Composable
fun lazyRow()
{
    LazyRow (
        modifier = Modifier
            .width(240.dp)
            .padding(top = 10.dp, start = 20.dp)
    ){
        val mylist= getAllImage()
        itemsIndexed(mylist, itemContent = {index, item ->
            imagelistItem(item=item)
        })
    }
}
@Composable
fun imagelistItem(item:Data)
{
    Image(painter = painterResource(id = item.Image), contentDescription =null,
        modifier = Modifier.size(40.dp,40.dp)
        )
}
@Composable
fun addButton()
{
    Column(
        modifier = Modifier
            .size(100.dp, 120.dp)
            .clip(RoundedCornerShape(20.dp))
            .background(Color.Black)
            .padding(start = 20.dp),

    ) {
          IconButton(onClick = { /*TODO*/ },
              modifier = Modifier.padding(top = 20.dp)

          ) {
              Icon(Icons.Filled.Add, contentDescription = null,tint= Color.White)

          }


        Text(text = "Add",
            style = TextStyle(
                fontSize = 14.sp,
                fontWeight = FontWeight.Normal,
                color = Color.White
            )
            ,
            modifier = Modifier.padding(start = 11.dp)

        )

    }
}

@Composable
fun lazyColum()
{
 LazyColumn {
     val myList= getAllDataproduct()
     itemsIndexed(myList, itemContent = {index, item ->
         lazyColumnItem(item = item)
     })
 }
}

@Composable
fun lazyColumnItem(item:branddata)
{
    Row(
        modifier = Modifier.padding(start = 22.dp)
    ) {
      image2(item = item)
       Spacer(modifier = Modifier.width(20.dp))
        Column {
            Text(text = "${item.name}",
                style = TextStyle(
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )
                ,
                modifier = Modifier.padding(start = 11.dp)

            )
            Text(text = "${item.date}",
                style = TextStyle(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color.Black
                )
                ,
                modifier = Modifier.padding(start = 11.dp)

            )
        }
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "${item.price}",
            style = TextStyle(
                fontSize = 19.sp,
                fontWeight = FontWeight.Medium,
                color = Color.Black
            )
            ,
            modifier = Modifier.padding(end = 20.dp)

        )
    }
}