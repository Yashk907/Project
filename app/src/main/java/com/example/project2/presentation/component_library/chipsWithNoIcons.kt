
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
    successChipNoIcon(
        LabelColor = Colorchips().succesChipLabel,
        textColor =Colorchips().successChipText,
        text = "Success")
}

@Composable
fun successChipNoIcon(LabelColor : Color=Color.Transparent,
                text : String,
                textColor : Color = Color.White,
                modifier: Modifier = Modifier) {
    Card (colors = CardDefaults.cardColors(LabelColor),
        shape = RoundedCornerShape(3.dp),
        modifier = Modifier.height(24.dp)){
        Row (modifier= Modifier
            .align(Alignment.CenterHorizontally)
            .padding(vertical = 4.dp, horizontal = 8.dp)){
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
    InformationChipNoIcon(labelColor = Colorchips().infoChipLabel,
        textColor = Colorchips().infoChipText,
        text = "Information")
}

@Composable
fun InformationChipNoIcon(labelColor : Color=Color.Transparent,
                    text : String,
                    textColor : Color = Color.White,
                    modifier: Modifier = Modifier) {
    Card (colors = CardDefaults.cardColors(labelColor),
        shape = RoundedCornerShape(3.dp),
        modifier = Modifier.height(24.dp)){
        Row (modifier= Modifier
            .align(Alignment.CenterHorizontally)
            .padding(vertical = 4.dp, horizontal = 8.dp)){
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
    FailedChipNoIcon(LabelColor = Colorchips().FailedChipLabel,
        textColor = Colorchips().failedChipText,
        text = "Failed")
}

@Composable
fun FailedChipNoIcon(LabelColor : Color=Color.Transparent,
               text : String,
               textColor : Color = Color.White,
               modifier: Modifier = Modifier) {
    Card (colors = CardDefaults.cardColors(LabelColor),
        shape = RoundedCornerShape(3.dp),
        modifier = Modifier.height(24.dp)){
        Row (modifier= Modifier
            .align(Alignment.CenterHorizontally)
            .padding(vertical = 4.dp, horizontal = 8.dp)){
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
    ProcesschipNoIcon(LabelColor = Colorchips().ProcessingChipLabel,
        text ="Processing" ,
        textColor = Colorchips().processingChipText,
         )
}

@Composable
fun ProcesschipNoIcon(LabelColor : Color=Color.Transparent,
                text : String,
                textColor : Color = Color.White,
                modifier: Modifier = Modifier) {
    Card (colors = CardDefaults.cardColors(LabelColor),
        shape = RoundedCornerShape(3.dp),
        modifier = Modifier.height(24.dp)){
        Row (modifier= Modifier
            .align(Alignment.CenterHorizontally)
            .padding(vertical = 4.dp, horizontal = 8.dp)){
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
    successChipNoIcon(
        textColor = Colorchips().successChipText,
        text = "Success")
}

//informationChip with transparent back
@Preview
@Composable
private fun Preview6() {
    InformationChipNoIcon(
        textColor = Colorchips().infoChipText, text = "Information")
}
//Failed chip with transparent back
@Preview
@Composable
private fun Preview7() {
    FailedChipNoIcon(
        textColor = Colorchips().failedChipText, text = "Failed")
}

//Progress chip with transparent back
@Preview
@Composable
private fun Preview8() {
    ProcesschipNoIcon(
        text ="Processing" ,
        textColor = Colorchips().processingChipText)
}