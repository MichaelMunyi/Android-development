package com.example.mike

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mikeapp.MainActivity
import com.example.workapplication.R

class Layoutactivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Layout()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
//Start of top app bar
fun Layout(){
    Column (modifier =Modifier.fillMaxSize()){

        val mContext= LocalContext.current
        //topappbar
        TopAppBar(title = { androidx.compose.material3.Text(text = "Home"
        ) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Green),
            navigationIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color.Red


                    )
                }//end od top of topappbar

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




        Spacer(modifier = Modifier.height(5.dp))

        androidx.compose.material3.Text(
            text ="Breed of dogs",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center)

        Spacer(modifier = Modifier.height(5.dp))


        Row {
            Image(painter = painterResource(id = R.drawable.german),
                contentDescription ="suarez",
                modifier = Modifier.size(width = 150.dp, height = 150.dp))


            Column {
                androidx.compose.material3.Text(
                    text = "Bull Dog",
                    fontSize = 18.sp)
                androidx.compose.material3.Text(text = "Luis")
            }
        }
        //End of row

        Spacer(modifier = Modifier.height(5.dp))


        Row {
            Image(painter = painterResource(id = R.drawable.hallan),
                contentDescription ="Halland",
                modifier = Modifier.size(width = 150.dp, height = 150.dp))


            Column {
                androidx.compose.material3.Text(
                    text = "Bull Dog",
                    fontSize = 18.sp)
                androidx.compose.material3.Text(text = "Halland")
            }
        }
        //End of row

        Spacer(modifier = Modifier.height(5.dp))


        Row {
            Image(painter = painterResource(id = R.drawable.german),
                contentDescription ="Messi",
                modifier = Modifier.size(width = 150.dp, height = 150.dp))


            Column {
                androidx.compose.material3.Text(
                    text = "Bull Dog",
                    fontSize = 18.sp)
                androidx.compose.material3.Text(text = "Amazind dog")
            }
        }
        //End of row
        Row {
            Button(
                onClick = {
                    mContext.startActivity(Intent(mContext, MainActivity::class.java))
                },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red))
            {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Arrowback",
                    tint = Color.Black)
                androidx.compose.material3.Text(text = "Back")
            }
        }
        Row {
            Button(
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Red))
            {
                androidx.compose.material3.Text(text = "Next")
            }
        }


    }





}



@Preview(showBackground = true)
@Composable
fun LayoutPreview(){
    Layout()
}