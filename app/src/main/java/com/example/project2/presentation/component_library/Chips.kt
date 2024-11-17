import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
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

//Chips

//SuccessChip
@Preview
@Composable
private fun Preview1() {
    successChip(
        LabelColor = Color(0xFF241F33),
        iconImage =R.drawable.check, Icontint = Color(0xFF54D68A),
        textColor = Color(0xFF54D68A), text = "Success")
}

@Composable
fun successChip(LabelColor : Color=Color.Transparent,
                         iconImage : Int,
                         text : String,
                Icontint : Color,
                         textColor : Color = Color.White,
                         modifier: Modifier = Modifier) {
    Card (colors = CardDefaults.cardColors(LabelColor),
        shape = RoundedCornerShape(3.dp),
        modifier = Modifier.height(24.dp)){
        Row (modifier= Modifier
            .align(Alignment.CenterHorizontally)
            .padding(vertical = 4.dp, horizontal = 8.dp)){
            Icon(painter = painterResource(iconImage),
                contentDescription = "Icon",
                tint = Icontint,
                modifier = Modifier
                    .size(12.dp)
                    .align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.padding(horizontal = 6.dp))
            Text(text = text,
                fontFamily = FontFamily(Font(R.font.interrr)),
                color = textColor,
                fontSize = 12.sp
            )
        }
    }
}

//informationChip
@Preview
@Composable
private fun Preview2() {
    InformationChip(LabelColor = Color(0xFF241F33),
        iconImage =R.drawable.info, Icontint = Color(0xFF66B3FF),
        textColor = Color(0xFF66B3FF), text = "Information")
}

@Composable
fun InformationChip(LabelColor : Color=Color.Transparent,
                iconImage : Int,
                text : String,
                Icontint : Color,
                textColor : Color = Color.White,
                modifier: Modifier = Modifier) {
    Card (colors = CardDefaults.cardColors(LabelColor),
        shape = RoundedCornerShape(3.dp),
        modifier = Modifier.height(24.dp)){
        Row (modifier= Modifier
            .align(Alignment.CenterHorizontally)
            .padding(vertical = 4.dp, horizontal = 8.dp)){
            Icon(painter = painterResource(iconImage),
                contentDescription = "Icon",
                tint = Icontint,
                modifier = Modifier
                    .size(10.dp)
                    .align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.padding(horizontal = 6.dp))
            Text(text = text,
                fontFamily = FontFamily(Font(R.font.interrr)),
                color = textColor,
                fontSize = 12.sp
            )
        }
    }
}

//Failed chip
@Preview
@Composable
private fun Preview3() {
    FailedChip(LabelColor = Color(0xFF241F33),
        iconImage =R.drawable.cross1, Icontint = Color(0xFFDC7D8E),
        textColor = Color(0xFFDC7D8E), text = "Failed")
}

@Composable
fun FailedChip(LabelColor : Color=Color.Transparent,
                    iconImage : Int,
                    text : String,
                    Icontint : Color,
                    textColor : Color = Color.White,
                    modifier: Modifier = Modifier) {
    Card (colors = CardDefaults.cardColors(LabelColor),
        shape = RoundedCornerShape(3.dp),
        modifier = Modifier.height(24.dp)){
        Row (modifier= Modifier
            .align(Alignment.CenterHorizontally)
            .padding(vertical = 4.dp, horizontal = 8.dp)){
            Icon(painter = painterResource(iconImage),
                contentDescription = "Icon",
                tint = Icontint,
                modifier = Modifier
                    .size(10.dp)
                    .align(Alignment.CenterVertically)
            )
            Spacer(modifier = Modifier.padding(horizontal = 6.dp))
            Text(text = text,
                fontFamily = FontFamily(Font(R.font.interrr)),
                color = textColor,
                fontSize = 12.sp
            )
        }
    }
}

//Progress chip
@Preview
@Composable
private fun Preview4() {
Processchip(LabelColor = Color(0xFF241F33),
      text ="Processing" ,
    ShowIndicator = true,
    textColor = Color(0xFFFFAD5C),
    LoaderColor =  Color(0xFFFFAD5C) )
}

@Composable
fun Processchip(LabelColor : Color=Color.Transparent,
               text : String,
                ShowIndicator: Boolean,
                LoaderColor : Color,
               textColor : Color = Color.White,
               modifier: Modifier = Modifier) {
    Card (colors = CardDefaults.cardColors(LabelColor),
        shape = RoundedCornerShape(3.dp),
        modifier = Modifier.height(24.dp)){
        Row (modifier= Modifier
            .align(Alignment.CenterHorizontally)
            .padding(vertical = 4.dp, horizontal = 8.dp)){
            if (ShowIndicator){
                CircularProgressIndicator(modifier= Modifier
                    .size(10.dp)
                    .align(Alignment.CenterVertically),
                    color = LoaderColor,
                    strokeWidth = 1.dp)
                Spacer(modifier = Modifier.padding(horizontal = 6.dp))
            }
            Text(text = text,
                fontFamily = FontFamily(Font(R.font.interrr)),
                color = textColor,
                fontSize = 12.sp
            )
        }
    }
}

//Chips with transparent background 
//For this just dont give any paqrameter to color as the default param is Transparent color

//success chip with transparent back
@Preview
@Composable
private fun Preview5() {
    successChip(
        iconImage =R.drawable.check, Icontint = Color(0xFF54D68A),
        textColor = Color(0xFF54D68A), text = "Success")
}

//informationChip with transparent back
@Preview
@Composable
private fun Preview6() {
    InformationChip(
        iconImage =R.drawable.info, Icontint = Color(0xFF66B3FF),
        textColor = Color(0xFF66B3FF), text = "Information")
}
//Failed chip with transparent back
@Preview
@Composable
private fun Preview7() {
    FailedChip(
        iconImage =R.drawable.cross1, Icontint = Color(0xFFDC7D8E),
        textColor = Color(0xFFDC7D8E), text = "Failed")
}

//Progress chip with transparent back
@Preview
@Composable
private fun Preview8() {
    Processchip(
        text ="Processing" ,
        ShowIndicator = true,
        textColor = Color(0xFFFFAD5C),
        LoaderColor =  Color(0xFFFFAD5C) )
}