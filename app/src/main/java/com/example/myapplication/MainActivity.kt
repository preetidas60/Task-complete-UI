package com.example.myapplication

import android.os.Bundle
import android.text.Layout.Alignment
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Correct("All tasks completed", "Nice work",imagePainter= painterResource(R.drawable.logo))
                }
            }
        }
    }
}

@Composable
fun Correct(name: String, message : String, imagePainter : Painter, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.photo)
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally,
        modifier = Modifier.padding(50.dp)
    ){
        Image(
            painter = image,
            contentDescription = null,

        )
        Text(
            text = name,
            fontSize = 20.sp,
            modifier = modifier
                .padding(
                    top = 24.dp,
                    bottom = 8.dp
                ),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = message,
            modifier = modifier.padding(
                start = 15.dp
            ),
            fontSize = 20.sp

            )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        Correct("All tasks completed", "Nice work", imagePainter= painterResource(R.drawable.logo))
    }
}