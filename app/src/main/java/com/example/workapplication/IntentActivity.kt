import android.content.Intent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import com.example.mikeapp.FormActivity


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyIntents() {
    Column(
        modifier = androidx.compose.ui.Modifier.fillMaxSize()
    ) {

        val mContext= LocalContext.current
        // Top App Bar
        TopAppBar(
            title = { Text(text = "Home") },
            colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Green),
            navigationIcon = {
                IconButton(onClick = { /* TODO: Handle navigation icon click */ }) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color.Red
                    )
                }
            }
        )

        // Mpesa Button
        OutlinedButton(
            onClick = {

                val smsIntent=Intent(Intent.ACTION_SENDTO)
                smsIntent.data="smsto:0720245837".toUri()
                smsIntent.putExtra("sms_body","Hello Glory,how was your day?")
                mContext.startActivity(smsIntent)

            },
            modifier = androidx.compose.ui.Modifier
                .height(100.dp)
                .fillMaxWidth()
                .padding(horizontal = 30.dp, vertical = 8.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Red)
        ) {
            Text(text = "Mpesa")
        }

        // Messages Button
        OutlinedButton(
            onClick = { val smsIntent=Intent(Intent.ACTION_SENDTO)
                smsIntent.data="smsto:0720245837".toUri()
                smsIntent.putExtra("sms_body","Hello Mike,how was your day?")
                mContext.startActivity(smsIntent) },
            modifier = androidx.compose.ui.Modifier
                .height(60.dp)
                .fillMaxWidth()
                .padding(horizontal = 30.dp, vertical = 8.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Red)
        ) {
            Text(text = "Messages")
        }

        // Call Button
        OutlinedButton(
            onClick = {   val callIntent=Intent(Intent.ACTION_DIAL)
                callIntent.data="tel:0720245837".toUri()
                mContext.startActivity(callIntent)},
            modifier = androidx.compose.ui.Modifier
                .height(60.dp)
                .fillMaxWidth()
                .padding(horizontal = 30.dp, vertical = 8.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Red)
        ) {
            Text(text = "Call")
        }

        // Email Button
        OutlinedButton(
            onClick = {
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.type = "text/plain"
                shareIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf("akinyiglory2@gmail.com"))
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                shareIntent.putExtra(Intent.EXTRA_TEXT, "Hello, this is the email body")
                mContext.startActivity(shareIntent) },
            modifier = androidx.compose.ui.Modifier
                .height(60.dp)
                .fillMaxWidth()
                .padding(horizontal = 30.dp, vertical = 8.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(2.dp, Color.Red)
        ) {
            Text(text = "Email")
        }

        // Camera Button
        OutlinedButton(
            onClick = { /* TODO: Handle Camera button click */ },
            modifier = androidx.compose.ui.Modifier
                .height(60.dp)
                .fillMaxWidth()
                .padding(horizontal = 30.dp, vertical = 8.dp),
            shape = RoundedCornerShape(5.dp),
            border = BorderStroke(width = 2.dp, color = Color.Red)
        ) {
            Text(text = "Camera")


        }


        Spacer(modifier = androidx.compose.ui.Modifier.height(20.dp))
        Text(text = "Dont have an account?Register", color = Color.White, fontSize = 24.sp,
            modifier = androidx.compose.ui.Modifier.fillMaxWidth().height(30.dp).clickable { mContext.startActivity(
                Intent(mContext, FormActivity::class.java)
            ) }, fontWeight = FontWeight.ExtraLight, textAlign = TextAlign.Center, textDecoration = TextDecoration.Underline )

    }
}

@Preview(showBackground = true)
@Composable
fun MyIntentstpreview() {
    MyIntents()
}
