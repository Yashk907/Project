package com.example.project2.presentation.component

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2.R

//tabs
@Composable
fun TabContent(modifier: Modifier = Modifier) {
    ScrollableTabRow(selectedTabIndex = 0,
        edgePadding = 0.dp,
        tabs={
            TabText(text = "Gold")
            TabText(text = "Mar UPI")
            TabText(text = "Nek")
            TabText(text = "Loan")
        },
        containerColor = Color.Transparent,
        contentColor = Color.White,
        modifier = modifier
            .fillMaxHeight(0.1f)
            .padding(top = 15.dp)
    )
}
//content for tabs
@Composable
fun TabText(text: String,modifier: Modifier = Modifier) {
    Text(text = text,
        fontFamily = FontFamily(Font(R.font.inter_bold)),
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(vertical = 10.dp, horizontal = 30.dp))
}