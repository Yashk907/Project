package com.example.project2.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2.R

//gold locker Card
@Composable
fun GoldCard(modifier: Modifier = Modifier) {
    Box(modifier = modifier.background(color = Color.Transparent)){
        Image(painter = painterResource(id = R.drawable.bg),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize())
        Column {
            Column(modifier= Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, bottom = 0.dp)
                .fillMaxHeight(0.55f)){
                Row {
                    GoldInfo()
                    VaultImage()
                }
            }
            Box(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()) {
                PillerImage()
                SaveButton(modifier = Modifier.align(Alignment.BottomCenter))
            }

        }
    }


}

//Content for Gold card
@Composable
fun GoldInfo(modifier: Modifier = Modifier) {
    Column {
        Text(text = "24K Gold in Locker",
            fontSize = 12.sp,
            fontFamily = FontFamily(Font(R.font.inter_bold)),
            color = Color(0xFFD3853B),
            modifier = Modifier.padding(start = 20.dp, top = 10.dp))
        Row ( modifier = Modifier.padding(start = 20.dp, top = 5.dp)){
            Text(text = "0.828gm",
                fontFamily = FontFamily(Font(R.font.inter_bold)),
                fontSize = 24.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
            )
            VerticalDivider(modifier= Modifier
                .padding(horizontal = 10.dp)
                .height(30.dp))
            Icon(painter = painterResource(id = R.drawable.rupee),
                modifier = Modifier
                    .size(25.dp)
                    .align(Alignment.CenterVertically),
                contentDescription ="" ,
                tint = Color.Gray)
            Text(text = "1200",
                fontSize = 20.sp,
                color = Color.Gray,
                fontFamily = FontFamily(Font(R.font.inter_bold)),
                fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.CenterVertically))

        }

    }
}

@Composable
fun VaultImage(modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .background(color = Color.Transparent)
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(bottom = 10.dp)){
        Image(painter = painterResource(id = R.drawable.savingvault),
            contentDescription = "Vault",
            modifier= Modifier
                .height(63.35.dp)
                .width(88.dp)
                .align(Alignment.BottomCenter)
        )
    }
}

@Composable
fun PillerImage(modifier: Modifier = Modifier) {
    Box(modifier = Modifier
        .background(color = Color.Transparent)
        .fillMaxWidth()
        .fillMaxHeight(0.5f)
        .padding(end = 40.dp)){
        Image(painter = painterResource(id = R.drawable.piller),
            contentDescription = "Piller",
            modifier= Modifier
                .height(79.dp)
                .width(88.dp)
                .align(Alignment.BottomEnd))
    }
}

@Composable
fun SaveButton(modifier: Modifier = Modifier) {
    Button(onClick = { /*TODO*/ },modifier= modifier
        .fillMaxWidth()
        .fillMaxHeight(0.7f)
        .padding(bottom = 10.dp, start = 30.dp, end = 20.dp),
        colors = ButtonDefaults.buttonColors(Color(0xFF5A21A3)),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(text = "Save Manually",
            fontFamily = FontFamily(Font(R.font.inter_bold))
        )
    }
}