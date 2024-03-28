package com.example.mike2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.workapplication.R

class DestinationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Destination()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Destination(){
    Column (modifier = Modifier.fillMaxSize()){

        val mContext = LocalContext.current
        //topappbar
        TopAppBar(title = { Text(text = "Destination"
        ) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Green),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color.Red
                    )

                }
            },
            actions = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Share, contentDescription = "Share",
                        tint = Color.Black)

                }

                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Settings, contentDescription = "Share",
                        tint = Color.Black)

                }
            }

        )
//End of topappbar



        Box(modifier = Modifier
            .fillMaxWidth()
            .height(150.dp),
            contentAlignment = Alignment.Center) {

            Image(painter = painterResource(id = R.drawable.hotel),
                contentDescription = "Destination",
                modifier = Modifier
                    .fillMaxSize()
                    .height(200.dp),
                contentScale = ContentScale.Crop)

            Text(
                text = "Lets plan your next vacation",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,

                )//end of box



        }
        //start of searchbar
        Spacer(modifier = Modifier.height(20.dp))

        var search by remember { mutableStateOf("") }

        OutlinedTextField(value = search, onValueChange ={search =it},
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),

            placeholder = { Text(text = "What is your next destination")
            },
            leadingIcon = { Icon(imageVector = Icons.Default.Search,
                contentDescription ="Search" )}

        )//end of searchbar
        Spacer(modifier = Modifier.height(20.dp))

        Text(text = "Recently viewed",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace,
            modifier = Modifier.padding(start = 20.dp, end = 20.dp)
        )
        Spacer(modifier = Modifier.height(5.dp))



        Row {
            //start of card1
            Card (modifier = Modifier
                .height(250.dp)
                .width(200.dp)) {
                Column {
                    Box (contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                    ){
                        Image(painter = painterResource(id = R.drawable.hotel)
                            , contentDescription ="Halland",
                            modifier = Modifier.fillMaxSize(),
                            contentScale =  ContentScale.Crop)
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "Hotel",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }
            }

            //End of card
            Spacer(modifier = Modifier.width(5.dp))


            //start of card1
            Card (modifier = Modifier
                .height(250.dp)
                .width(200.dp)) {
                Column {
                    Box (contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                    ){
                        Image(painter = painterResource(id = R.drawable.hotel)
                            , contentDescription ="Halland",
                            modifier = Modifier.fillMaxSize(),
                            contentScale =  ContentScale.Crop)
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "Hotel",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }
            }

            //End of card
            Spacer(modifier = Modifier.width(5.dp))


            //start of card1
            Card (modifier = Modifier
                .height(250.dp)
                .width(200.dp)) {
                Column {
                    Box (contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                    ){
                        Image(painter = painterResource(id = R.drawable.hotel)
                            , contentDescription ="Halland",
                            modifier = Modifier.fillMaxSize(),
                            contentScale =  ContentScale.Crop)
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "Hotel",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }
            }

            //End of card
            Spacer(modifier = Modifier.width(5.dp))


            //start of card1
            Card (modifier = Modifier
                .height(250.dp)
                .width(200.dp)) {
                Column {
                    Box (contentAlignment = Alignment.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                    ){
                        Image(painter = painterResource(id = R.drawable.hotel)
                            , contentDescription ="Hotel",
                            modifier = Modifier.fillMaxSize(),
                            contentScale =  ContentScale.Crop)
                    }
                    Spacer(modifier = Modifier.height(5.dp))
                    Text(text = "Hotel",
                        fontSize = 15.sp,
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center)
                }
            } //End of card


            Spacer(modifier = Modifier.width(5.dp))

        }




    }
}

@Preview(showBackground = true)
@Composable
fun Destinationpreview(){
    Destination()
}
