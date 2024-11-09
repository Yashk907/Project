import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2.R

//buttons (status, statement , filter)
@Composable
fun ButtonRow(onclickStatus: () -> Unit,
              modifier: Modifier = Modifier
) {
    Row (modifier.fillMaxWidth()){
        Statusbuttoncontent("Status", R.drawable.down_arrow,
            onclickStatus,
            modifier
                .weight(0.33f)
                .padding(5.dp))
        buttoncontent("Statement", R.drawable.download,
            modifier
                .weight(0.33f)
                .padding(5.dp))
        buttoncontent("Filters", R.drawable.filter,
            modifier
                .weight(0.33f)
                .padding(5.dp))

    }
}

@Composable
fun Statusbuttoncontent(text: String,
                        icon: Int,
                        onclickStatus : ()->Unit,
                        modifier: Modifier = Modifier) {
    OutlinedButton(onClick = onclickStatus,
        contentPadding = ButtonDefaults.TextButtonWithIconContentPadding,
        shape = RoundedCornerShape(10.dp),
        modifier=modifier,
        colors = ButtonDefaults.outlinedButtonColors(Color(0xFF241F33))) {
        Text(text = text,
            color = Color.White,
            fontFamily = FontFamily(Font(R.font.inter_bold)),
            fontSize = 10.sp)
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
        colors = ButtonDefaults.outlinedButtonColors(Color(0xFF241F33))) {

        Image(painter = painterResource(id = icon),
            contentDescription = "",
            colorFilter = ColorFilter.tint(Color.White),
            modifier = Modifier
                .size(13.dp)
                .padding(start = 2.dp))
        Text(text = text,
            color = Color.White,
            fontFamily = FontFamily(Font(R.font.inter_bold)),
            fontSize = 11.sp)
    }
}