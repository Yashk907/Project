package com.example.project2.presentation.component

import Screen1ViewModel
import android.util.Log
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
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
fun TabContent(screen1ViewModel: Screen1ViewModel,
               modifier: Modifier = Modifier) {
    ScrollableTabRow(selectedTabIndex = screen1ViewModel.selectedTabIndexed.value,
        edgePadding = 0.dp,
        containerColor = Color.Transparent,
        contentColor = Color.White,
        modifier = modifier
            .fillMaxHeight(0.1f)
            .fillMaxWidth()
            .padding(top = 15.dp)
    ){
        Log.d("slect",screen1ViewModel.selectedTabIndexed.toString())
        screen1ViewModel.scrollableRowButtonList.forEachIndexed{
            index, title ->
            Tab(selected = screen1ViewModel.selectedTabIndexed.value==index,
                onClick = { screen1ViewModel.onClickTab(index)},
                ) {
                TabText(text = title)
            }
        }
    }
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