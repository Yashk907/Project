import android.text.Layout
import androidx.compose.foundation.BorderStroke
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
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2.R

//Pills with LeadingIcon(rupees)
@Preview
@Composable
private fun Preview() {
   FilledPill(Price = 40,
        bordercolor = Color(0xFF61587A),
        pillColor = Color(0xFF322B47))

}

@Composable
fun FilledPill(
    pillColor: Color,
    bordercolor : Color,
    Price: Int,
    modifier: Modifier = Modifier
) {
    Card(shape = RoundedCornerShape(6.dp),
        border = BorderStroke(0.7.dp,bordercolor),
        colors = CardDefaults.cardColors(pillColor)) {
        Row (modifier = Modifier
            .height(30.dp)
            .padding(top = 8.dp, bottom = 8.dp, start = 20.dp, end = 20.dp),
            ){
            Icon(painter = painterResource(id = R.drawable.rupee),
                contentDescription ="Rupees",
                tint = Color.White,
                modifier = Modifier
                    .size(12.dp)
                    .align(Alignment.CenterVertically)
                    )
            Text(text = Price.toString(),
                fontSize = 12.sp,
                color = Color.White,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }
    }

}

//using same function changing color parameters
@Preview
@Composable
private fun Preview2() {
   FilledPill(pillColor = Color(0xFF8D54D6), bordercolor =  Color(0xFF8D54D6),
        Price =40 )
}

//Pillwith having tag at Bottom
@Preview
@Composable
private fun Preview3() {
    pillWithTag(Price = 40,
        bordercolor = Color(0xFF61587A),
        pillColor = Color(0xFF322B47),
        tagText = "POPULAR",
        tagbgcolor = Color(0xFF7029CC))
}

@Composable
fun pillWithTag( pillColor: Color,
                 bordercolor : Color,
                 Price: Int,
                 tagText  : String,
                 tagbgcolor : Color,
                 modifier: Modifier = Modifier) {
    Card(modifier=Modifier.height(52.dp),
        shape = RoundedCornerShape(6.dp),
        border = BorderStroke(0.7.dp,bordercolor),
        colors = CardDefaults.cardColors(pillColor)) {
        Row (modifier = Modifier
            .height(30.dp)
            .align(Alignment.CenterHorizontally)
            .padding(top = 8.dp, bottom = 8.dp, start = 20.dp, end = 20.dp),
        ){
            Icon(painter = painterResource(id = R.drawable.rupee),
                contentDescription ="Rupees",
                tint = Color.White,
                modifier = Modifier
                    .size(12.dp)
                    .align(Alignment.CenterVertically)
            )
            Text(text = Price.toString(),
                fontSize = 12.sp,
                color = Color.White,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }
        Box (modifier = Modifier
            .height(22.dp)
            .background(tagbgcolor)
            ){
            Text(text = tagText,
                fontSize = 10.sp,
                color = Color.White,
                fontFamily = FontFamily(Font(R.font.interrr)),
                modifier = Modifier.align(Alignment.Center)
                    .padding(horizontal = 20.dp))

        }
    }
}