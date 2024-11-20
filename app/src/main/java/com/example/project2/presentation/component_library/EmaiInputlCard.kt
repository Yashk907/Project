import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2.R

@Preview
@Composable
private fun Preview() {
EmailInputCard(question = "What's your email?",
    buttonText = "Save")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EmailInputCard(cardcolor : Color=Color(0xFF241F33),
                   question:String,
                   buttonText : String,
                   buttonColors: Color=Color(0xFF5A21A3),
                   modifier: Modifier = Modifier) {
    Card(colors =CardDefaults.cardColors(cardcolor) ) {
        Column (modifier = Modifier.padding(20.dp)){
            Text(text = question,
                color = Color.White,
                fontSize = 16.sp,
                fontFamily = FontFamily(Font(R.font.inter_bold)),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(vertical = 10.dp)
            )
            textfield(modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp, horizontal = 10.dp))
            button(buttonColors = buttonColors,
                buttonText =buttonText ,
                modifier= Modifier
                    .fillMaxWidth()
                    .padding(top = 60.dp, bottom = 20.dp, start = 10.dp, end = 10.dp))
            textButton(modifier=Modifier.align(Alignment.CenterHorizontally))

        }
        }

}

@Composable
fun textfield(modifier: Modifier = Modifier) {
    var input by remember {
        mutableStateOf("")
    }
    OutlinedTextField(value = input,
        trailingIcon = {
            checkWithCircleIcon(iconTint = Color(0xFF21A357),
                checkIconTint = Color.White,
                modifier = Modifier.size(16.dp))
        },
        singleLine = true,
        isError = false,
        shape = RoundedCornerShape(15.dp),
        onValueChange = {email->input=email},
        textStyle = TextStyle(fontFamily = FontFamily(Font(R.font.inter_bold)),
            color = Color.White, fontSize = 16.sp),
        colors = TextFieldDefaults.colors(
            focusedTextColor = Color.White,
            unfocusedTextColor = Color.White,
//                focusedIndicatorColor = Color.Transparent,//changes the color of the border when there it is touched
            unfocusedIndicatorColor = Color.Transparent,//changes the color of the border when the textfield is not touched
            focusedPlaceholderColor = Color.Transparent,
            unfocusedPlaceholderColor = Color.Transparent,
            focusedContainerColor = Color(0xFF160829),
            unfocusedContainerColor = Color(0xFF160829),
            errorContainerColor = Color(0xFF160829),

        ),
        modifier = modifier
    )
}

@Composable
fun button(buttonColors: Color,
           buttonText: String,
           modifier: Modifier = Modifier) {
    Button(onClick = { /*TODO*/ },
        modifier= modifier,
        colors = ButtonDefaults.buttonColors(buttonColors),
        shape = RoundedCornerShape(10.dp)
    ) {
        Text(text = buttonText,
            fontFamily = FontFamily(Font(R.font.inter_bold)),
            modifier = Modifier.padding(vertical = 10.dp)
        )
    }
}

@Composable
fun textButton(modifier: Modifier = Modifier) {
    TextButton(onClick = { /*TODO*/ },
        modifier=modifier) {
        Text(text = "Cancel",
            textDecoration =
            TextDecoration.Underline,
            color = Color.White
        )
    }
}