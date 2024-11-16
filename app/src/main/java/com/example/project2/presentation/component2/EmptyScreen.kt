package com.example.project2.presentation.component2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2.R

@Preview(showSystemUi = true)
@Composable
private fun Previ() {
    MarUpiEmptyScreen()
}

@Composable
fun MarUpiEmptyScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(painter = painterResource(id = R.drawable.bgmarupi),
            contentDescription ="Background mask " ,
            modifier = Modifier
                .padding(bottom = 150.dp)
                .align(Alignment.Center)
                .height(343.28.dp)
                .width(360.dp))

        Column (verticalArrangement = Arrangement.Center
            , horizontalAlignment = Alignment.CenterHorizontally,
            modifier=Modifier.align(Alignment.Center)
            .padding(top= 100.dp, bottom = 300.dp)){
            Image(painter = painterResource(id = R.drawable.lowgpbg),//use lowbg image to show preview
                                                                     //use marupiemptyscreen
                contentDescription ="Image over bg Card" ,
            )
            Text(text = "No Transaction Found",
                textAlign = TextAlign.Center,
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.inter_bold)),
                fontWeight = FontWeight(700),
                color = Color.White,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 4.dp)
            )
            Text(text = "All UPI transactions will appear here",
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                fontFamily = FontFamily(Font(R.font.interrr)),
                fontWeight = FontWeight(400),
                color = Color.White,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }

    }
}
