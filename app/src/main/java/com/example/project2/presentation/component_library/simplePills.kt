import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2.R

//simple pill with No icon
@Preview
@Composable
private fun Preview() {
    SimplePillWithNoIcon(text = "Buy",
        bordercolor = Color(0xFF61587A),
        pillColor = Color(0xFF322B47))
}
@Composable
fun SimplePillWithNoIcon(
    pillColor: Color,
    bordercolor : Color,
   text : String,
    modifier: Modifier = Modifier
) {
    Card(shape = RoundedCornerShape(6.dp),
        border = BorderStroke(0.7.dp,bordercolor),
        colors = CardDefaults.cardColors(pillColor)) {
        Row (modifier = Modifier
            .height(30.dp)
            .padding(top = 8.dp, bottom = 8.dp, start = 20.dp, end = 20.dp),
        ){
            Text(text = text,
                fontSize = 12.sp,
                fontFamily = FontFamily(Font(R.font.interrr)),
                color = Color.White,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }
    }

}

//simple pill with leadingIcon
@Preview
@Composable
private fun Preview2() {
    SimplePill(text = "Buy",
        bordercolor = Color(0xFF61587A),
        Icon =R.drawable.phone,
        pillColor = Color(0xFF322B47))
}
@Composable
fun SimplePill(
    pillColor: Color,
    bordercolor : Color,
    Icon : Int,
    text : String,
    modifier: Modifier = Modifier
) {
    Card(shape = RoundedCornerShape(6.dp),
        border = BorderStroke(0.7.dp,bordercolor),
        colors = CardDefaults.cardColors(pillColor)) {
        Row (modifier = Modifier
            .height(30.dp)
            .padding(top = 8.dp, bottom = 8.dp, start = 20.dp, end = 20.dp),
        ){
            Icon(painter = painterResource(Icon),
                contentDescription ="Rupees",
                tint = Color.White,
                modifier = Modifier
                    .size(12.dp)
                    .align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.padding(horizontal = 2.dp))
            Text(text = text,
                fontSize = 12.sp,
                color = Color.White,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
        }
    }

}