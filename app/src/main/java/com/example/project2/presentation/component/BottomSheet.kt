package com.example.project2.presentation.component

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.BottomSheetScaffold
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2.R
import kotlinx.coroutines.launch

//BottomSheet
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheet(IsStatusButtonClicked:Boolean,
                onclickClose:()->Unit,
                modifier: Modifier = Modifier
) {
    val bottomsheetState= rememberBottomSheetScaffoldState()
    val scope = rememberCoroutineScope()
    LaunchedEffect (Unit){
        scope.launch {
            bottomsheetState.bottomSheetState.expand()
        }
    }
    BottomSheetScaffold(
        scaffoldState = bottomsheetState,
        modifier = Modifier.fillMaxHeight(),
        sheetDragHandle = { Box(modifier = Modifier.padding(vertical = 12.dp)) },
        sheetContainerColor = Color(0xFF322B47)
        ,sheetContent = {

            //Content of the sheet
            Column {
                Row (modifier= Modifier.fillMaxWidth()){
                    Text(text ="Payment Status",
                        color = Color.White,
                        fontFamily = FontFamily(Font(R.font.inter_bold)),
                        fontSize = 16.sp,
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .align(Alignment.CenterVertically)
                    )
                    Box(modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 0.dp)){
                        IconButton(onClick = onclickClose,
                            modifier = Modifier.align(Alignment.CenterEnd)) {
                            Icon(imageVector = Icons.Default.Close ,
                                contentDescription = "close",
                                tint = Color.White
                            )
                        }
                    }
                }
                BottomSheetComponent("Successful", R.drawable.success)
                BottomSheetComponent(text = "Failed", img = R.drawable.cross)
                BottomSheetComponent(text = "Processing", img = R.drawable.processing)
                Button(onClick = { /*TODO*/ },modifier= Modifier
                    .fillMaxWidth()
                    .height(95.dp)
                    .padding(top = 20.dp, bottom = 20.dp, start = 20.dp, end = 10.dp)
                    ,
                    colors = ButtonDefaults.buttonColors(Color(0xFF7029CC)),
                    shape = RoundedCornerShape(10.dp)
                ) {
                    Text(text = "Apply",
                        fontFamily = FontFamily(Font(R.font.inter_bold))
                    )
                }
            }
        },
        //managing background of sheet
        containerColor = Color(0xFF1D1829).copy(alpha = 0.9f)) {
        Box(modifier = Modifier.fillMaxSize()){
        }
    }
}

//Component of bottomSheet
@Composable
fun BottomSheetComponent(text: String,
                         img: Int,
                         modifier: Modifier = Modifier) {
    Row (modifier = Modifier
        .fillMaxWidth()
        .padding(start = 20.dp, top = 10.dp)){
        Image(painter = painterResource(id =img)
            , contentDescription = "Success",
            modifier= Modifier
                .size(20.dp)
                .align(Alignment.CenterVertically))
        Text(text = text,
            fontSize = 14.sp,
            color = Color.White,
            textAlign = TextAlign.Center,
            fontFamily = FontFamily(Font(R.font.interrr)),
            modifier= Modifier
                .padding(start = 10.dp)
                .align(Alignment.CenterVertically))
        Box(modifier = Modifier
            .fillMaxWidth()
            .padding(end = 10.dp)){
            Checkbox(checked = false,
//                                colors =CheckboxDefaults.colors(Color.White) ,
                onCheckedChange =null,
                modifier=Modifier.align(Alignment.CenterEnd))
        }

    }
}