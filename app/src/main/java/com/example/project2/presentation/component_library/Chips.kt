
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Info
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2.R

//Chips

enum class StumatoChipType(){
    SUCCESS,
    PROCESSING,
    FAILED,
    INFORMATION
}

/**
 * Composable function
 * @param type The type of the chip.
 * @param labelColor The background color of the chip. Defaults to Transparent.
 * @param text The text to display inside the chip.
 * @param iconTint The tint color for the leading icon.
 * @param textColor The color of the text. Defaults to White.
 * @param fontSize The size of the text. Defaults to 12.sp.
 * @param showIndicator If true, shows a CircularProgressIndicator (used for PROCESS type).
 * @param loaderColor The color of the CircularProgressIndicator.
 * @param onClick Lambda to handle click events. If null, the chip is not clickable.
 * @param modifier Modifier for styling.
 */

@Composable
fun StumatoChip(type : StumatoChipType,
                labelColor: Color = Color.Transparent,
                text: String,
                iconTint: Color,
                textColor: Color = Color.White,
                fontSize: TextUnit = 12.sp,
                showIndicator: Boolean = false,
                loaderColor: Color = Color.White,
                onClick: (() -> Unit)? = null,
                modifier: Modifier = Modifier) {
    Card (colors = CardDefaults.cardColors(labelColor),
        shape = RoundedCornerShape(3.dp),
        modifier = Modifier.height(24.dp)){
        Row (modifier= Modifier
            .align(Alignment.CenterHorizontally)
            .padding(vertical = 4.dp, horizontal = 8.dp)){
            when(type){
                StumatoChipType.SUCCESS->
                    Icon(imageVector = Icons.Default.CheckCircle,
                        contentDescription = "Icon",
                        tint = iconTint,
                        modifier = Modifier
                            .size(12.dp)
                            .align(Alignment.CenterVertically)
                    )
                StumatoChipType.INFORMATION->
                    Icon(imageVector = Icons.Default.Info,
                        contentDescription = "Icon",
                        tint = iconTint,
                        modifier = Modifier
                            .size(12.dp)
                            .align(Alignment.CenterVertically)
                    )
                StumatoChipType.FAILED->
                   CloseWithCircleIcon(iconTint = iconTint,
                       modifier = Modifier
                       .size(12.dp)
                       .align(Alignment.CenterVertically))
                StumatoChipType.PROCESSING->
                    if (showIndicator){
                        CircularProgressIndicator(modifier= Modifier
                            .size(10.dp)
                            .align(Alignment.CenterVertically),
                            color = loaderColor,
                            strokeWidth = 1.dp)
                        Spacer(modifier = Modifier.padding(horizontal = 6.dp))
                    }

            }
            Spacer(modifier = Modifier.padding(horizontal = 6.dp))
            Text(text = text,
                fontFamily = FontFamily(Font(R.font.interrr)),
                color = textColor,
                fontSize = 12.sp
            )
        }
    }

    
}


@Preview(showBackground = false)
@Composable
private fun PreviewSuccessChipWithBackground() {
    StumatoChip(
        type = StumatoChipType.SUCCESS,
        labelColor = Color(0xFF241F33),
        text = "Success",
        iconTint = Color(0xFF54D68A),
        textColor = Color(0xFF54D68A)
    )
}

@Preview(showBackground = false)
@Composable
private fun PreviewInformationChipWithBackground() {
    StumatoChip(
        type = StumatoChipType.INFORMATION,
        labelColor = Color(0xFF241F33),
        text = "Information",
        iconTint = Color(0xFF66B3FF),
        textColor = Color(0xFF66B3FF)
    )
}

@Preview(showBackground = false)
@Composable
private fun PreviewFailedChipWithBackground() {
    StumatoChip(
        type = StumatoChipType.FAILED,
        labelColor = Color(0xFF241F33),
        text = "Failed",
        iconTint = Color(0xFFDC7D8E),
        textColor = Color(0xFFDC7D8E)
    )
}

@Preview(showBackground = false)
@Composable
private fun PreviewProcessChipWithBackground() {
    StumatoChip(
        type = StumatoChipType.PROCESSING,
        labelColor = Color(0xFF241F33),
        text = "Processing",
        iconTint = Color.Transparent,
        textColor = Color(0xFFFFAD5C),
        showIndicator = true,
        loaderColor = Color(0xFFFFAD5C)
    )
}

@Preview(showBackground = false)
@Composable
private fun PreviewSuccessChipWithoutBackground() {
    StumatoChip(
        type = StumatoChipType.SUCCESS,
        labelColor = Color.Transparent,
        text = "Success",
        iconTint = Color(0xFF54D68A),
        textColor = Color(0xFF54D68A)
    )
}

@Preview(showBackground = false)
@Composable
private fun PreviewInformationChipWithoutBackground() {
    StumatoChip(
        type = StumatoChipType.INFORMATION,
        labelColor = Color.Transparent,
        text = "Information",
        iconTint = Color(0xFF66B3FF),
        textColor = Color(0xFF66B3FF)
    )
}

@Preview(showBackground = false)
@Composable
private fun PreviewFailedChipWithoutBackground() {
    StumatoChip(
        type = StumatoChipType.FAILED,
        labelColor = Color.Transparent,
        text = "Failed",
        iconTint = Color(0xFFDC7D8E),
        textColor = Color(0xFFDC7D8E)
    )
}

@Preview(showBackground = false)
@Composable
private fun PreviewProcessChipWithoutBackground() {
    StumatoChip(
        type = StumatoChipType.PROCESSING,
        labelColor = Color.Transparent,
        text = "Processing",
        iconTint = Color.Transparent,
        textColor = Color(0xFFFFAD5C),
        showIndicator = true,
        loaderColor = Color(0xFFFFAD5C)
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewClickableChip() {
    StumatoChip(
        type = StumatoChipType.SUCCESS,
        labelColor = Color.Transparent,
        text = "Clickable Success",
        iconTint = Color(0xFF54D68A),
        textColor = Color(0xFF54D68A),
        onClick = { /* Handle click */ }
    )
}

@Preview(showBackground = true)
@Composable
private fun PreviewCustomFontSizeChip() {
    StumatoChip(
        type = StumatoChipType.INFORMATION,
        labelColor = Color.Transparent,
        text = "Large Text",
        iconTint = Color(0xFF66B3FF),
        textColor = Color(0xFF66B3FF),
        fontSize = 14.sp
    )
}