package com.example.project2.presentation.component

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2.R

@Composable
fun SectionHeader(text : String,
                  modifier: Modifier = Modifier) {
    Text(text = text,
        fontFamily = FontFamily(Font(R.font.inter_bold)),
        fontSize = 14.sp,
        textAlign = TextAlign.Start,
        modifier= Modifier.padding(start = 8.dp, bottom = 4.dp, top = 4.dp),
        color = Color.White)
}