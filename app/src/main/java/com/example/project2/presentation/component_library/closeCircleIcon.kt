import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun Preview(modifier: Modifier = Modifier) {
    CloseWithCircleIcon()
}

@Composable
fun CloseWithCircleIcon(iconTint : Color=Color.White,
                        crossIconTint : Color=Color.Black,
                    modifier: Modifier = Modifier) {
Box(modifier=modifier.clip(CircleShape)
    .background(iconTint)
    ){
Icon(imageVector = Icons.Default.Close,
    contentDescription ="Icon",
    tint = crossIconTint,
    modifier=Modifier.padding(2.dp))
}
}