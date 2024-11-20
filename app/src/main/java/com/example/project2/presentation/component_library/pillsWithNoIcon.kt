import android.text.Layout
import androidx.compose.foundation.BorderStroke
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

class filledPillNoIcon(){
    val pillColor =Color(0xFF322B47)
    val bordercolor =Color(0xFF61587A)
    val tagcolor =Color(0xFFD05268)
}
//Pills with LeadingIcon(rupees)
@Preview
@Composable
private fun Preview() {
    FilledPillWithNIcon(Price = 1,
        text = "gm",
        bordercolor =filledPillNoIcon().bordercolor ,
        pillColor = filledPillNoIcon().pillColor)

}

@Composable
fun FilledPillWithNIcon(
    pillColor: Color,
    bordercolor : Color,
    Price: Int,
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
            Text(text = Price.toString(),
                fontSize = 12.sp,
                color = Color.White,
                modifier = Modifier.align(Alignment.CenterVertically)
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

//Pillwith having tag at Bottom
@Preview
@Composable
private fun Preview3() {
    pillWithTagNoIcon(Price = 1,
        bordercolor = filledPillNoIcon().bordercolor,
        pillColor = filledPillNoIcon().pillColor,
        text = "gm",
        tagText = "OUT OF STOCK",
        tagbgcolor = filledPillNoIcon().tagcolor)
}

@Composable
fun pillWithTagNoIcon( pillColor: Color,
                 bordercolor : Color,
                 Price: Int,
                       text: String,
                 tagText  : String,
                 tagbgcolor : Color,
                 modifier: Modifier = Modifier) {
    Card(modifier=Modifier.height(52.dp),
        shape = RoundedCornerShape(6.dp),
        border = BorderStroke(0.7.dp,bordercolor),
        colors = CardDefaults.cardColors(pillColor)) {
        Row (modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .height(35.dp)
            .padding(top = 8.dp, bottom = 8.dp, start = 20.dp, end = 20.dp),
        ){
            Text(text = Price.toString(),
                fontSize = 12.sp,
                color = Color.White,
                modifier = Modifier.align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.padding(horizontal = 1.dp))
            Text(text = text,
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
                fontFamily = FontFamily(Font(R.font.inter_bold)),
                modifier = Modifier.align(Alignment.Center)
                    .padding(horizontal = 8.dp))

        }
    }
}