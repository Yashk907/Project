package com.example.project2.presentation

import Screen1ViewModel
import ScrollingScreen
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.project2.presentation.component.BottomSheet

//Preview
 @Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview() {
    Screen1(screen1ViewModel = Screen1ViewModel())
}


@Composable
fun Screen1(screen1ViewModel: Screen1ViewModel,
            modifier: Modifier = Modifier) {
    val isStatusButtonClicked =screen1ViewModel.isStatusButtonClicked.value
    val scrollState= rememberLazyListState()
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.radialGradient(
                    colors = listOf(Color(0xFF3A1576), Color(0xFF21174A)),
                    center = Offset(500f, 200f),
                    radius = 700f
                )
            )
    ) {
        //Scrolling
        ScrollingScreen(viewModel = screen1ViewModel,
            IsStatusButtonClicked = isStatusButtonClicked,
            scrollState = scrollState,
            onclickStatus = {screen1ViewModel.onStatusButtonClick()})
        //Handling the modalBottomsheet
        if(isStatusButtonClicked){
            BottomSheet(IsStatusButtonClicked = isStatusButtonClicked,
                onclickClose = {screen1ViewModel.onCloseBottomSheet()})
        }
    }
}








