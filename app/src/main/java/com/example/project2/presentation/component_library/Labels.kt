import androidx.compose.foundation.layout.Column
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

//Labels
//labels with icon

@Preview
@Composable
private fun Preview1() {
    RoundedLabelWithIcon(LabelColor = Color(0xFF8D54D6),
        R.drawable.tag,
        "EXCLUSIVE OFFER")
}
@Composable
fun RoundedLabelWithIcon(LabelColor : Color,
                         iconImage : Int,
                         text : String,
                         textColor : Color=Color.White,
                         modifier: Modifier = Modifier) {
    Card (colors = CardDefaults.cardColors(LabelColor),
        modifier = Modifier.height(24.dp)){
        Row (modifier= Modifier
            .align(Alignment.CenterHorizontally)
            .padding(vertical = 5.dp, horizontal = 8.dp)){
            Icon(painter = painterResource(iconImage),
                contentDescription = "Icon",
                tint = Color.White,
                modifier = Modifier
                    .size(10.dp)
                    .align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.padding(horizontal = 1.5.dp))
            Text(text = text,
                fontFamily = FontFamily(Font(R.font.inter_bold)),
                color = textColor,
                fontSize = 10.sp
                )
        }
    }
}


//half rounded label

@Preview
@Composable
private fun Preview2() {
    HalfRoundedLabelWithIcon(LabelColor = Color(0xFF8D54D6),
        R.drawable.tag,
        "EXCLUSIVE OFFER")
}
@Composable
fun HalfRoundedLabelWithIcon(LabelColor : Color,
                         iconImage : Int,
                         text : String,
                         textColor : Color=Color.White,
                         modifier: Modifier = Modifier) {
    Card (colors = CardDefaults.cardColors(LabelColor),
        shape = RoundedCornerShape(bottomStart = 0.dp,
            bottomEnd = 0.dp,
            topEnd = 10.dp,
            topStart = 10.dp),
        modifier = Modifier.height(24.dp)){
        Row (modifier= Modifier
            .align(Alignment.CenterHorizontally)
            .padding(vertical = 5.dp, horizontal = 8.dp)){
            Icon(painter = painterResource(iconImage),
                contentDescription = "Icon",
                tint = Color.White,
                modifier = Modifier
                    .size(10.dp)
                    .align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.padding(horizontal = 1.5.dp))
            Text(text = text,
                fontFamily = FontFamily(Font(R.font.inter_bold)),
                color = textColor,
                fontSize = 10.sp
                )
        }
    }
}

//RoundedLabel with no leading icon

@Preview
@Composable
private fun Preview3() {
    RoundedLabel(LabelColor = Color(0xFF8D54D6),
        "EXCLUSIVE OFFER")
}
@Composable
fun RoundedLabel(LabelColor : Color,
                         text : String,
                         textColor : Color=Color.White,
                         modifier: Modifier = Modifier) {
    Card (colors = CardDefaults.cardColors(LabelColor),
        modifier = Modifier.height(24.dp)){
        Row (modifier= Modifier
            .align(Alignment.CenterHorizontally)
            .padding(vertical = 5.dp, horizontal = 8.dp)){
            Text(text = text,
                fontFamily = FontFamily(Font(R.font.inter_bold)),
                color = textColor,
                fontSize = 10.sp
            )
        }
    }
}


//halfRounded label without leading icon
@Preview
@Composable
private fun Preview4() {
    HalfRoundedLabel(LabelColor = Color(0xFF8D54D6),
        "EXCLUSIVE OFFER")

}
@Composable
fun HalfRoundedLabel(LabelColor : Color,
                             text : String,
                             textColor : Color=Color.White,
                             modifier: Modifier = Modifier) {
    Card (colors = CardDefaults.cardColors(LabelColor),
        shape = RoundedCornerShape(bottomStart = 0.dp,
            bottomEnd = 0.dp,
            topEnd = 10.dp,
            topStart = 10.dp),
        modifier = Modifier.height(24.dp)){
        Row (modifier= Modifier
            .align(Alignment.CenterHorizontally)
            .padding(vertical = 5.dp, horizontal = 8.dp)){
            Text(text = text,
                fontFamily = FontFamily(Font(R.font.inter_bold)),
                color = textColor,
                fontSize = 10.sp
            )
        }
    }
}



