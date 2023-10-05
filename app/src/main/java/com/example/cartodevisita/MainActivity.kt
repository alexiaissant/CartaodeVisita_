package com.example.cartodevisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartodevisita.ui.theme.CartãoDeVisitaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CartãoDeVisitaTheme {


            }
        }
    }
}
@Preview(showSystemUi = true)
@Composable
fun CartaoDeVisita(){
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally

    ){
    Image(
        painter = painterResource(id = R.drawable.mulher),
        contentDescription =null,
        contentScale = ContentScale.Fit,
        modifier = Modifier
            .size(220.dp)
            .fillMaxWidth()
        )
        Text(
            text = "Alexia Luis dos Santos",
            fontSize = 30.sp,
            color = Color.Black,
            fontWeight = FontWeight.Black,
            fontFamily = FontFamily.Default,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
            )
        Text(
            text ="Desenvolvedora de Sites com Marketing Digital",
            fontSize = 20.sp,
            color = Color.LightGray,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily.Default

        )
    }
    Column (
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom
    ){
        Row (
            horizontalArrangement = Arrangement.Center,

        ){
            Image(painter = painterResource(id = R.drawable.ultima),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(40.dp)
                    .padding(bottom = 10.dp)

            )
            Text(
                text = "+11 997552768",
                fontFamily = FontFamily.Default,
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(start = 10.dp)
                    .padding(top = 3.dp)
            )
        }
        Row (
            horizontalArrangement = Arrangement.Center,

            ){
            Image(painter = painterResource(id = R.drawable.inste),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(40.dp)
                    .padding(bottom = 10.dp)

            )
            Text(
                text = "@alexia_issant",
                fontFamily = FontFamily.Default,
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(start = 10.dp)
                    .padding(top = 3.dp)
            )
        }
        Row (
            horizontalArrangement = Arrangement.Center,

            ){
            Image(painter = painterResource(id = R.drawable.email),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .size(40.dp)
                    .padding(bottom = 10.dp)

            )
            Text(
                text = "alexia@etec.sp.gov.br",
                fontFamily = FontFamily.Default,
                fontSize = 15.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(start = 10.dp)
                    .padding(top = 3.dp)
            )
        }
    }
}