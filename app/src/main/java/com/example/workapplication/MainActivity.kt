package com.example.mikeapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.workapplication.R

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Text()

        }
    }
}

@Composable
fun Text() {
    Column {
        val mContext = LocalContext.current
        Text(text = "Welcome to android",
            fontSize = 30.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic)

        Text(text = "Manchester is blue",
            fontSize = 29.sp,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Red)
                .height(50.dp),
            textAlign = TextAlign.Center,
            textDecoration = TextDecoration.Underline




        )
        Text(text = "1.German mustiff",
        )
        Text(
            text = "2.Mit")

        Text(
            text = "3. Cybersecurity")

        Spacer(modifier =Modifier.height(20.dp))

        Text(
            text = "4.Data security")

        Box (modifier =Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ){

            Button(
                onClick ={
                    mContext.startActivity(Intent(mContext,MainActivity::class.java))
                },

                shape = RoundedCornerShape(5.dp),
                colors = ButtonDefaults.buttonColors(Color.Blue),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 30.dp, end = 30.dp)


            )

            {
                androidx.compose.material3.Text(text = "Login")

            }

        }

        Spacer(modifier = Modifier.height(10.dp))
        Divider()

        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            Image(painter = painterResource(id = R.drawable.hallan)
                , contentDescription = "halland",
                modifier = Modifier
                    .size(200.dp)
                    .clip(shape = CircleShape),
                contentScale = ContentScale.Crop


            )
        }
        Spacer(modifier = Modifier.height(40.dp))
        Button(onClick = { /*TODO*/ },
            shape = RoundedCornerShape(5.dp),
            colors = ButtonDefaults.buttonColors(Color.Red),
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp)
        ) {





        }
    }

}

class MainActivity {

}


@Preview(showBackground = true)
@Composable
fun Textpreview() {
    Text()
}