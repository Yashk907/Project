package com.example.project2

//import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Preview() {
    Screen()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.radialGradient(
                    colors = listOf(Color(0xFF3B1B72), Color(0xFF221340)),
                    center = Offset(500f,200f),
                    radius =700f
                )
//                linearGradient(
//                    colors = listOf(Color(0xFF3B1B72), Color(0xFF221340)), // Purple shades
//                    start = Offset(0f, 0f),
//                    end = Offset(0f, 1000f)
//                )
            )
    ) {
        Scaffold (containerColor = Color.Transparent
            , topBar = {
                Row (modifier= Modifier
                    .statusBarsPadding()
                    .padding(vertical = 5.dp, horizontal = 20.dp)
                   ){
                    texticon("VR",modifier = Modifier.fillMaxWidth(0.18f))
                    Spacer(modifier = Modifier.fillMaxWidth(0.35f))
                    icon(R.drawable.support,modifier = Modifier.fillMaxWidth(0.3f))
                    Spacer(modifier=Modifier.fillMaxWidth(0.02f))
                    extendedicon(img1 = R.drawable.gift, modifier = Modifier.fillMaxWidth()
                    )
                }

            }){
                it->

            Column (modifier = Modifier
                .fillMaxSize()
                .padding(it)){

                Tabs(
                    modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.1f))//tabs
                GoldCard(modifier= Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.3f))

                //List
                LazyColumn(modifier= Modifier
                    .background(Color(0xFF190427))
                    .fillMaxHeight()) {
                    item { ButtonRow() }
                    item{Text(text = "Today",
                        fontSize = 14.sp,
                        textAlign = TextAlign.Start,
                        modifier=Modifier.padding(start = 10.dp),
                        color = Color.White)}
                    items(datastore().list){
                            content->
                        ListCard(content)
                    }
                    item{Text(text = "Yesterday",
                        fontSize = 14.sp,
                        modifier=Modifier.padding(start = 10.dp),
                        textAlign = TextAlign.Start,
                        color = Color.White)}
                    items(datastore().list){
                            content->
                        ListCard(content)
                    }
                    item{Text(text = "4 October 2024",
                        fontSize = 14.sp,
                        textAlign = TextAlign.Start,
                        modifier=Modifier.padding(start = 10.dp),
                        color = Color.White)}
                    items(datastore().list){
                            content->
                        ListCard(content)
                    }
                }

            }



        }
    }
    }





//extended icons in topbar
@Composable
fun extendedicon(img1 : Int,
                 icon: ImageVector =Icons.Default.Notifications,
                 modifier: Modifier = Modifier) {
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
//icons used in topbar
@Composable
fun icon(icon: Int,//com.example.project1.icon parameter
         modifier: Modifier = Modifier) {
    Column (modifier){
        Box(
            modifier = Modifier
                .size(50.dp) // Adjust size of com.example.project1.icon
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(Color(0xFF2B173D), Color(0xFF4F3964)), //gradient colors
                        center = Offset(130f, 120f), // Center of the gradient
                        radius = 140f,
                    ),
                    shape = CircleShape
                ) // shape of the box
                .padding(10.dp) // Inner padding for com.example.project1.icon spacing
        ) {
            Icon(
                painter = painterResource(id = icon), // Use the desired com.example.project1.icon
                contentDescription = "Profile Icon",
                tint = Color.White, // Icon color
                modifier = Modifier
                    .fillMaxSize()
//                .padding(12.dp)// padding of image
            )
        }
    }

}
//com.example.project1.texticon used in topbar
@Composable
fun texticon(text : String="VR",//com.example.project1.icon parameter
             modifier: Modifier = Modifier) {
    Column (modifier){
        Box(contentAlignment = Alignment.Center,//Alignment of the Text
            modifier = Modifier
                .size(50.dp) // Adjust size of com.example.project1.icon
                .background(
                    brush = Brush.radialGradient(
                        colors = listOf(Color(0xFF2B173D), Color(0xFF4F3964)), //gradient colors
                        center = Offset(130f, 120f), // Center of the gradient
                        radius = 140f,
                    ),
                    shape = CircleShape // shape of the box
                )
                .padding(8.dp) // Inner padding for com.example.project1.icon spacing
        ) {
            Text(text = text,
                color = Color.White,
                textAlign = TextAlign.Center,
            )
        }
    }

}

//tabs
@Composable
fun Tabs(modifier: Modifier = Modifier) {
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
    )
}

//content for tabs
@Composable
fun TabText(text: String,modifier: Modifier = Modifier) {
    Text(text = text,
        fontSize = 20.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(vertical = 10.dp, horizontal = 30.dp))
}

//gold locker Card
@Composable
fun GoldCard(modifier: Modifier = Modifier) {
    Card(colors = CardDefaults.cardColors(Color.Transparent)
        ,modifier = modifier) {
        Column (modifier= Modifier
            .fillMaxWidth()
            .padding(top = 20.dp, bottom = 35.dp)){
            Row {
                Column {
                    Text(text = "24K Gold in Locker",
                        fontSize = 16.sp,
                        color = Color(0xFFD3853B),
                        modifier = Modifier.padding(start = 20.dp, top = 10.dp))
                    Row ( modifier = Modifier.padding(start = 20.dp, top = 5.dp)){
                        Text(text = "0.828gm",
                            fontSize = 25.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold,
                        )
                        VerticalDivider(modifier= Modifier
                            .padding(horizontal = 10.dp)
                            .height(30.dp))
                        Icon(imageVector = Icons.Default.Star,
                            contentDescription ="" ,
                            tint = Color.White)
                        Text(text = "1200",
                            fontSize = 25.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold)

                    }

                }

            }
        }
        Button(onClick = { /*TODO*/ },modifier= Modifier
            .fillMaxWidth()
            .padding(vertical = 10.dp, horizontal = 14.dp),
            shape = RoundedCornerShape(10.dp)
        ) {
            Text(text = "Save Manually")
        }
    }
}

//listMenu
@Composable
fun ListCard(content : content,modifier: Modifier = Modifier) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 10.dp, horizontal = 10.dp),
        colors = CardDefaults.cardColors(Color(0xFF290A3E))) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 10.dp,
                vertical = 10.dp
            )) {
            Column(modifier=Modifier.fillMaxWidth(0.16f)) {
                Box (
                    modifier = Modifier
                        .size(50.dp)
                        .background(
                            Color.White,
                            shape = CircleShape
                        ),
                )
            }
            Spacer(modifier = modifier.fillMaxWidth(0.05f))
            Column (
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth(0.65f)){
                Text(text = "Manual Buy",
                    fontSize = 16.sp,
                    color = Color.White,
                    modifier = Modifier.align(Alignment.Start))
                Spacer(modifier = Modifier.padding(vertical = 4.dp))
                Row {
                    Icon(painter = painterResource(content.image),
                        contentDescription = "",
                        tint = Color.Green,
                        modifier = Modifier.size(16.dp))
                    Text(text = "7.00 PM",
                        modifier = Modifier.padding(horizontal = 3.dp),
                        color = Color.White)
                    Icon(painter = painterResource(id = R.drawable.dot),
                        contentDescription ="" ,
                        tint = Color.White,
                        modifier = Modifier.size(16.dp))
                    Text(text = "Sep 18",
                        color = Color.White,
                        modifier = Modifier.padding(horizontal = 3.dp))
                }
            }
//            Spacer(modifier = modifier.fillMaxWidth(0.03f))
            Column(modifier= Modifier
                .align(Alignment.CenterVertically)
                .fillMaxWidth()) {
                Column(modifier = Modifier.align(Alignment.End)) {
                    Row {
                        Icon(painter = painterResource(id = R.drawable.rupee),
                            contentDescription ="",
                            tint = Color.White,
                            modifier = Modifier.size(20.dp))
                        Text(text = content.price,
                            color = Color.White,
                            modifier = Modifier.align(Alignment.CenterVertically))
                    }}
                Column(modifier = Modifier.align(Alignment.End)) {
                    Row {
                        Text(text = content.weight,
                            color = Color.White)
                        Text(text = "gm",
                            color = Color.White)
                    }
                }


            }
        }

    }
}

//buttons
@Composable
fun ButtonRow(modifier: Modifier = Modifier) {
    Row (modifier.fillMaxWidth()){
        Statusbuttoncontent("Status",R.drawable.down_arrow,
            modifier
                .weight(0.33f)
                .padding(5.dp))
        buttoncontent("Statement",R.drawable.download,
            modifier
                .weight(0.33f)
                .padding(5.dp))
        buttoncontent("Filters",R.drawable.filter,
            modifier
                .weight(0.33f)
                .padding(5.dp))

    }
}

@Composable
fun Statusbuttoncontent(text: String,
                  icon: Int,
                  modifier: Modifier = Modifier) {
    OutlinedButton(onClick = { /*TODO*/ },
        contentPadding = ButtonDefaults.TextButtonWithIconContentPadding,
        shape = RoundedCornerShape(10.dp),
        modifier=modifier,
        colors = ButtonDefaults.outlinedButtonColors(Color(0xFF290A3E))) {
        Text(text = text,
            color = Color.White,
            fontSize = 14.sp)
        Image(painter = painterResource(id = icon),
            contentDescription = "",
            colorFilter = ColorFilter.tint(Color.White),
            modifier = Modifier
                .size(12.dp)
                .padding(start = 2.dp))
    }
}
@Composable
fun buttoncontent(text: String,
                  icon: Int,
                  modifier: Modifier = Modifier) {
    OutlinedButton(onClick = { /*TODO*/ },
        contentPadding = ButtonDefaults.TextButtonWithIconContentPadding,
        shape = RoundedCornerShape(10.dp),
        modifier=modifier,
        colors = ButtonDefaults.outlinedButtonColors(Color(0xFF290A3E))) {

        Image(painter = painterResource(id = icon),
            contentDescription = "",
            colorFilter = ColorFilter.tint(Color.White),
            modifier = Modifier
                .size(14.dp)
                .padding(start = 2.dp))
        Text(text = text,
            color = Color.White,
            fontSize = 14.sp)
    }
}