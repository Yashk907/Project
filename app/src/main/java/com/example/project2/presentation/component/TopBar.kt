package com.example.project2.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.project2.R

import texticon

@Composable
fun TopBar(modifier: Modifier = Modifier) {
    Row (modifier= Modifier
        .background(brush = Brush.radialGradient( //Background image
        colors = listOf(Color(0xFF3A1576), Color(0xFF21174A)),
        center = Offset(500f, 100f),
        radius = 600f
    ))
        .statusBarsPadding()
        .padding(vertical = 5.dp, horizontal = 20.dp)
    ){
        texticon("VR",modifier = Modifier.fillMaxWidth(0.18f))
        Spacer(modifier = Modifier.fillMaxWidth(0.35f))
        icon(R.drawable.support,modifier = Modifier.fillMaxWidth(0.3f))
        Spacer(modifier= Modifier.fillMaxWidth(0.02f))
        extendedicon(img1 = R.drawable.gift, modifier = Modifier.fillMaxWidth()
        )
    }
}