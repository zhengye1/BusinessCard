package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFD2E8D4)
                ) {
                    BusinessApp()
                }
            }
        }
    }
}


@Composable
fun BusinessApp() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        var name = stringResource(R.string.name)
        var title = stringResource(R.string.title)
        var avatar = painterResource(R.drawable.android_logo)
        var bilibiliLink = stringResource(id = R.string.biliLink)
        var twitterLink = stringResource(id = R.string.twiter)
        var email = stringResource(id = R.string.email)

        Image(
            painter = avatar,
            contentDescription = null,
            Modifier
                .fillMaxWidth(0.3f)
                .background((Color(0xFF073042)))
        )
        Text(
            text = name,
            fontSize = 50.sp,
            color = Color(0xFF1b211c),
            fontFamily = FontFamily.SansSerif
        )
        Text(
            text = title,
            fontSize = 25.sp,
            color = Color(0xFF5da17b),
            fontWeight = Bold,
            fontFamily = FontFamily.SansSerif
        )
        Spacer(modifier = Modifier.padding(bottom = 200.dp))
        Divider(modifier = Modifier.fillMaxWidth(), color = Color(0xFF4F6C79))
        ContactRow(
            text = email,
            icon = Icons.Rounded.Email
        )
        Divider(modifier = Modifier.fillMaxWidth(), color = Color(0xFF4F6C79))
        ContactRow(
            text = bilibiliLink,
            icon = Icons.Rounded.Share
        )
        Divider(modifier = Modifier.fillMaxWidth(), color = Color(0xFF4F6C79))
        ContactRow(
            text = twitterLink,
            icon = Icons.Rounded.Share
        )
    }

}

@Composable
fun ContactRow(
    text: String,
    icon: ImageVector
) {
    Row(
        horizontalArrangement = Arrangement.Center, modifier = Modifier.padding(16.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF187949),
            modifier = Modifier.weight(1f)
        )
        Text(text = text, color = Color.Black, modifier = Modifier.weight(3f))
    }
}


@Preview(showBackground = true)
@Composable
fun BusniessCardPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFD2E8D4)
    ) {
        BusinessCardTheme {
            BusinessApp()
        }
    }
}