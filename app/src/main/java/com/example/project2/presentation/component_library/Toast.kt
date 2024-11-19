import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2.R

//Toast
//Floating multi line Toast
@Preview
@Composable
private fun Preview1() {
FloatingMultiLineToast(ToastColor = Color(0xFFD4F5E2),
    Heading ="Banner heading" , image = R.drawable.success,
    Description = "You cannot make an internationnal transaction while your " +
            "internation settings are turn off",
    HeadingColor =Color(0xFF21A357),
    DescriptionColor = Color(0xFF197A41))
}

@Composable
fun FloatingMultiLineToast(ToastColor: Color,
                           Heading :String,
                           Description : String,
                           image : Int,
                           HeadingColor : Color,
                           DescriptionColor : Color,
                           modifier: Modifier = Modifier) {
        Card (colors = CardDefaults.cardColors(ToastColor)){
            Row(modifier=Modifier.padding(horizontal = 16.dp,
                vertical = 16.dp)) {
                Image(painter = painterResource(image),
                    contentDescription = "image",
                    modifier= Modifier
                        .size(18.dp)
                        .fillMaxWidth(0.3f))
                Column (modifier = Modifier
                    .padding(
                        start = 8.dp,
                        end = 12.dp
                    )
                    .fillMaxWidth(0.93f)){
                    Text(text = Heading,
                        fontFamily = FontFamily(Font(R.font.inter_bold)),
                        fontSize = 16.sp,
                        color = HeadingColor,
                        modifier = Modifier)
                    Text(text = Description,
                        color = DescriptionColor,
                        fontFamily = FontFamily(Font(R.font.interrr)),
                        overflow = TextOverflow.Clip,
                        fontSize = 12.sp,
                        modifier = Modifier.padding(top = 7.dp)
                        )
                    Spacer(modifier = Modifier.padding(vertical = 5.dp))
                    Row(modifier = Modifier
                        .clickable { }) {
                        Text(text = "Change settings",
                        color = DescriptionColor,
                            fontFamily = FontFamily(Font(R.font.interrr)),
                            fontSize = 14.sp,
                            )
                        Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                            contentDescription = "Icon right arrow",
                            tint = DescriptionColor,
                            modifier = Modifier.size(18.dp))
                    }
                }
                Icon(imageVector = Icons.Default.Close,
                    contentDescription = "close",
                    tint = DescriptionColor,
                    modifier = Modifier
                        .align(Alignment.Top)
                        .size(16.dp))
            }
        }
}

//Anchored multi line Toast
@Preview
@Composable
private fun Preview2() {
    AnchoredMultiLineToast(ToastColor = Color(0xFFD4F5E2),
        Heading ="Banner heading" , image = R.drawable.success,
        Description = "You cannot make an internationnal transaction while your " +
                "internation settings are turn off",
        HeadingColor =Color(0xFF21A357),
        DescriptionColor = Color(0xFF197A41))
}

@Composable
fun AnchoredMultiLineToast(ToastColor: Color,
                           Heading :String,
                           Description : String,
                           image : Int,
                           HeadingColor : Color,
                           DescriptionColor : Color,
                           modifier: Modifier = Modifier) {
    Card (shape = RoundedCornerShape(0.dp),
        colors = CardDefaults.cardColors(ToastColor)){
        Row(modifier=Modifier.padding(horizontal = 16.dp,
            vertical = 16.dp)) {
            Image(painter = painterResource(image),
                contentDescription = "image",
                modifier= Modifier
                    .size(18.dp)
                    .fillMaxWidth(0.3f))
            Column (modifier = Modifier
                .padding(
                    start = 8.dp,
                    end = 12.dp
                )
                .fillMaxWidth(0.93f)){
                Text(text = Heading,
                    fontFamily = FontFamily(Font(R.font.inter_bold)),
                    fontSize = 16.sp,
                    color = HeadingColor,
                    modifier = Modifier)
                Text(text = Description,
                    color = DescriptionColor,
                    fontFamily = FontFamily(Font(R.font.interrr)),
                    overflow = TextOverflow.Clip,
                    fontSize = 12.sp,
                    modifier = Modifier.padding(top = 7.dp)
                )
                Spacer(modifier = Modifier.padding(vertical = 5.dp))
                Row(modifier = Modifier
                    .clickable { }) {
                    Text(text = "Change settings",
                        color = DescriptionColor,
                        fontFamily = FontFamily(Font(R.font.interrr)),
                        fontSize = 14.sp,
                    )
                    Icon(imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                        contentDescription = "Icon right arrow",
                        tint = DescriptionColor,
                        modifier = Modifier.size(18.dp))
                }
            }
            Icon(imageVector = Icons.Default.Close,
                contentDescription = "close",
                tint = DescriptionColor,
                modifier = Modifier
                    .align(Alignment.Top)
                    .size(16.dp))
        }
    }
}

//Floating One line Toast
@Preview
@Composable
private fun Preview3() {
    FloatingOneLineToast(ToastColor = Color(0xFFD4F5E2),
        Heading ="Message" , image = R.drawable.success,
        HeadingColor =Color(0xFF21A357),
        CloseButtonColor = Color(0xFF197A41))
}

@Composable
fun FloatingOneLineToast(ToastColor: Color,
                           Heading :String,
                           image : Int,
                         CloseButtonColor : Color,
                           HeadingColor : Color,
                           modifier: Modifier = Modifier) {
    Card (colors = CardDefaults.cardColors(ToastColor)){
        Row(modifier=Modifier.padding(horizontal = 16.dp,
            vertical = 12.dp)) {
            Image(painter = painterResource(image),
                contentDescription = "image",
                modifier= Modifier
                    .size(18.dp)
                    .fillMaxWidth(0.3f))
            Column (modifier = Modifier
                .padding(
                    start = 8.dp,
                    end = 12.dp
                )
                .fillMaxWidth(0.93f)){
                Text(text = Heading,
                    fontFamily = FontFamily(Font(R.font.interrr)),
                    fontSize = 16.sp,
                    color = HeadingColor,
                    modifier = Modifier)

            }
            Icon(imageVector = Icons.Default.Close,
                contentDescription = "close",
                tint = CloseButtonColor,
                modifier = Modifier
                    .align(Alignment.Top)
                    .size(16.dp))
        }
    }
}

//Anchored One line Toast
@Preview
@Composable
private fun Preview4() {
    AnchoredOneLineToast(ToastColor = Color(0xFFD4F5E2),
        Heading ="Message" , image = R.drawable.success,
        HeadingColor =Color(0xFF21A357),
        CloseButtonColor = Color(0xFF197A41))
}

@Composable
fun AnchoredOneLineToast(ToastColor: Color,
                           Heading :String,
                           image : Int,
                         CloseButtonColor : Color,
                           HeadingColor : Color,
                           modifier: Modifier = Modifier) {
    Card (shape = RoundedCornerShape(0.dp),
        colors = CardDefaults.cardColors(ToastColor)){
        Row(modifier=Modifier.padding(horizontal = 16.dp,
            vertical = 12.dp)) {
            Image(painter = painterResource(image),
                contentDescription = "image",
                modifier= Modifier
                    .size(18.dp)
                    .fillMaxWidth(0.3f))
            Column (modifier = Modifier
                .padding(
                    start = 8.dp,
                    end = 12.dp
                )
                .fillMaxWidth(0.93f)){
                Text(text = Heading,
                    fontFamily = FontFamily(Font(R.font.interrr)),
                    fontSize = 16.sp,
                    color = HeadingColor,
                    modifier = Modifier)

            }
            Icon(imageVector = Icons.Default.Close,
                contentDescription = "close",
                tint = CloseButtonColor,
                modifier = Modifier
                    .align(Alignment.Top)
                    .size(16.dp))
        }
    }
}

@Preview
@Composable
private fun Preview5() {
    FloatingMultiLineToast(ToastColor = Color(0xFFE2D4F5),
        Heading ="Banner heading" , image = R.drawable.infopurple,
        Description = "You cannot make an internationnal transaction while your " +
                "internation settings are turn off",
        HeadingColor =Color(0xFF5A21A3),
        DescriptionColor = Color(0xFF43197A))
}

//Anchored multi line Toast
@Preview
@Composable
private fun Preview6() {
    AnchoredMultiLineToast(ToastColor = Color(0xFFE2D4F5),
        Heading ="Banner heading" , image = R.drawable.infopurple,
        Description = "You cannot make an internationnal transaction while your " +
                "internation settings are turn off",
        HeadingColor =Color(0xFF5A21A3),
        DescriptionColor = Color(0xFF43197A))
}

//Floating One line Toast
@Preview
@Composable
private fun Preview7() {
    FloatingOneLineToast(ToastColor = Color(0xFFE2D4F5),
        Heading ="Message" , image = R.drawable.infopurple,
        HeadingColor =Color(0xFF5A21A3),
        CloseButtonColor  = Color(0xFF43197A))
}

//Anchored One line Toast
@Preview
@Composable
private fun Preview8() {
    AnchoredOneLineToast(ToastColor = Color(0xFFE2D4F5),
        Heading ="Message" , image = R.drawable.infopurple,
        HeadingColor =Color(0xFF5A21A3),
        CloseButtonColor  = Color(0xFF43197A))
}


@Preview
@Composable
private fun Preview9() {
    FloatingMultiLineToast(ToastColor = Color(0xFFFDF3D6),
        Heading ="Banner heading" , image = R.drawable.caution,
        Description = "You cannot make an internationnal transaction while your " +
                "internation settings are turn off",
        HeadingColor =Color(0xFF92761D),
        DescriptionColor = Color(0xFF624E13))
}

//Anchored multi line Toast
@Preview
@Composable
private fun Preview10() {
    AnchoredMultiLineToast(ToastColor = Color(0xFFFDF3D6),
        Heading ="Banner heading" , image = R.drawable.caution,
        Description = "You cannot make an internationnal transaction while your " +
                "internation settings are turn off",
        HeadingColor =Color(0xFF92761D),
        DescriptionColor = Color(0xFF624E13))
}

//Floating One line Toast
@Preview
@Composable
private fun Preview11() {
    FloatingOneLineToast(ToastColor = Color(0xFFFDF3D6),
        Heading ="Message" , image =R.drawable.caution,
        HeadingColor =Color(0xFF92761D),
        CloseButtonColor =Color(0xFF624E13))
}

//Anchored One line Toast
@Preview
@Composable
private fun Preview12(){
    AnchoredOneLineToast(ToastColor = Color(0xFFFDF3D6),
        Heading ="Message" , image =R.drawable.caution,
        HeadingColor =Color(0xFF92761D),
        CloseButtonColor =Color(0xFF624E13))
}


@Preview
@Composable
private fun Preview13() {
    FloatingMultiLineToast(ToastColor = Color(0xFFF3D4D9),
        Heading ="Banner heading" , image = R.drawable.crossred,
        Description = "You cannot make an internationnal transaction while your " +
                "internation settings are turn off",
        HeadingColor =Color(0xFFC42742),
        DescriptionColor = Color(0xFF9D1F35))
}

//Anchored multi line Toast
@Preview
@Composable
private fun Preview14() {
    AnchoredMultiLineToast(ToastColor = Color(0xFFF3D4D9),
        Heading ="Banner heading" , image = R.drawable.crossred,
        Description = "You cannot make an internationnal transaction while your " +
                "internation settings are turn off",
        HeadingColor =Color(0xFFC42742),
        DescriptionColor = Color(0xFF9D1F35))
}

//Floating One line Toast
@Preview
@Composable
private fun Preview15() {
    FloatingOneLineToast(ToastColor = Color(0xFFF3D4D9),
        Heading ="Message" , image =R.drawable.crossred,
        HeadingColor =Color(0xFFC42742),
        CloseButtonColor =Color(0xFF9D1F35))
}

//Anchored One line Toast
@Preview
@Composable
private fun Preview16(){
    AnchoredOneLineToast(ToastColor = Color(0xFFF3D4D9),
        Heading ="Message" , image =R.drawable.crossred,
        HeadingColor =Color(0xFFC42742),
        CloseButtonColor =Color(0xFF9D1F35))
}
