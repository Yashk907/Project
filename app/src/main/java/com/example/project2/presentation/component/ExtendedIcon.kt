package com.example.project2.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

//extended icons in topbar
@Composable
fun extendedicon(img1 : Int,
                 icon: ImageVector = Icons.Default.Notifications,
                 modifier: Modifier = Modifier
) {
    Column(modifier) {
        Box(
            modifier = Modifier
                .align(Alignment.End)
                .width(150.dp)
                .size(50.dp) // Adjust size of com.example.project1.icon
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(Color(0xFF2B173D), Color(0xFF4F3964)), //gradient colors
                        center = Offset(130f, 120f), // Center of the gradient
                        radius = 250f,
                    ),
                    shape = RoundedCornerShape(50.dp)// shape of the box
                )
                .padding(10.dp)
        ) {
            Row {
                Icon(
                    imageVector = icon, // Use the desired com.example.project1.icon
                    contentDescription = "Profile Icon",
                    tint = Color.White, // Icon color
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.5f)
//                    .padding(5.dp)// padding of image
                )
                VerticalDivider(modifier = Modifier
                    .height(100.dp)
                    .padding(vertical = 10.dp, horizontal = 2.dp))
                Icon(
                    painter = painterResource(id = img1), // Use the desired com.example.project1.icon
                    contentDescription = "Profile Icon",
                    tint = Color.White, // Icon color
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(0.5f)
//                    .padding(5.dp) // padding of image
                )
            }


        }
    }

}