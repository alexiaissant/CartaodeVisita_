package com.example.cartodevisita

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
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
fun CartaoDeVisita() {

    Column(
        modifier = Modifier.background(Color(16,69,79)),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 170.dp),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            val borderWidth = 4.dp
            Image(
                painter = painterResource(id = R.drawable.mulher),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(150.dp)
                    .fillMaxWidth()
                    .border(
                        BorderStroke
                            (
                            borderWidth,
                            Color.LightGray
                        ),
                        CircleShape
                    )

            )
            Text(
                text = "Alexia Luis dos Santos",
                fontSize = 30.sp,
                color = Color(202,202,202,79),
                fontWeight = FontWeight.Black,
                fontFamily = FontFamily.Default,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
            )
            Text(
                text = "Desenvolvedora de Sites com Marketing Digital",
                fontSize = 20.sp,
                color = Color.LightGray,
                textAlign = TextAlign.Center,
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(
                        start = 10.dp,
                    end = 10.dp
                    )

            )
        }
        Column(
            modifier = Modifier
                .padding(bottom = 20.dp)
            ,
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            Contatos(text = "+55 (11) 99722-3452", image = R.drawable.ultima )
            Contatos(text = "alexia_issant", image = R.drawable.inste)
            Contatos(text = "alexia.santos12@etec.sp.gov.com", image = R.drawable.email)

        }
    }
}
@Composable
fun Contatos(text:String, image:Int){
    Row(
        horizontalArrangement = Arrangement.spacedBy(15.dp),
        verticalAlignment = Alignment.CenterVertically

        ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .size(30.dp)


        )
        Text(
            text = text,
            fontFamily = FontFamily.Default,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            color = Color(202, 202, 202, 79),

        )
    }

}