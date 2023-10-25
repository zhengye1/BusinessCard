package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Vincent")
                }
            }
        }
    }
}


@Composable
fun BusinessApp() {
    Column(Modifier.fillMaxWidth()) {
        BusinessCard(
            name = stringResource(R.string.name),
            title = stringResource(R.string.title),
            backgroundColor = Color(0xFF3ddc84),
            avatar = painterResource(R.drawable.android_logo)

        )
    }
    Column(Modifier.fillMaxWidth()) {
        ContactCard(
            bilibiliLink = stringResource(id = R.string.biliLink),
            twitterLink = stringResource(id = R.string.twiter),
            backgroundColor = Color(0xFF3ddc84),
            email = stringResource(id = R.string.email)
        )
    }
}

@Composable
private fun BusinessCard(
    name: String,
    title: String,
    backgroundColor: Color,
    avatar: Painter,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier.fillMaxSize()
            .background(backgroundColor),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = name,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
private fun ContactCard(
    bilibiliLink: String,
    twitterLink: String,
    email: String,
    backgroundColor: Color,
    modifier: Modifier = Modifier
) {

}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessApp()
    }
}