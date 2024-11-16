import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
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
import com.example.project2.Data.model.MarUpiContent
import com.example.project2.R
import com.example.project2.data.model.Content

@Preview
@Composable
private fun Screen2() {
    LazyColumn {
        items(Screen1ViewModel().contentList2){
            it->
            MarUpiCardcontent(content = it)
        }
    }

}
@Composable
fun MarUpiCardcontent (content: MarUpiContent,
                   modifier: Modifier = Modifier) {
    Card(modifier = Modifier
        .fillMaxWidth()
        .padding(vertical = 10.dp, horizontal = 10.dp),
        colors = CardDefaults.cardColors(Color(0xFF241F33))) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(
                horizontal = 10.dp,
                vertical = 10.dp
            )) {
            Column(modifier= Modifier.fillMaxWidth(0.17f)) {
                Box (
                    modifier = Modifier
                        .size(50.dp)
                        .background(
                            Color.White,
                            shape = CircleShape
                        ),
                )
            }
            Spacer(modifier = modifier.fillMaxWidth(0.05f))
            Column (
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .fillMaxWidth(0.65f)){
                Text(text = content.name,
                    fontSize = 14.sp,
                    color = Color.White,
                    fontFamily = FontFamily(Font(R.font.inter_bold)),
                    modifier = Modifier.align(Alignment.Start))
                Text(text = "UPI ID : Something@gmail.com",
                    fontSize = 12.sp,
                    modifier = Modifier.padding(horizontal = 3.dp,
                        vertical = 2.dp),
                    fontFamily = FontFamily(Font(R.font.interrr)),
                    color = Color.Gray,)
                Spacer(modifier = Modifier.padding(vertical = 0.dp))
                Row {
                    Image(painter = painterResource(content.image),
                        contentDescription = "",
                        modifier = Modifier
                            .size(14.dp)
                            .align(Alignment.CenterVertically))
                    Text(text = content.time,
                        fontSize = 12.sp,
                        modifier = Modifier.padding(horizontal = 3.dp),
                        fontFamily = FontFamily(Font(R.font.interrr)),
                        color = Color.Gray)
                    Icon(painter = painterResource(id = R.drawable.dot),
                        contentDescription ="" ,
                        tint = Color.Gray,
                        modifier = Modifier
                            .size(12.dp)
                            .align(Alignment.CenterVertically))
                    Text(text = content.date,
                        color = Color.Gray,
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.interrr)),
                        modifier = Modifier.padding(horizontal = 3.dp))
                }
            }
            Column(modifier= Modifier
                .align(Alignment.CenterVertically)
                .fillMaxWidth()) {
                Column(modifier = Modifier.align(Alignment.End)) {
                    Row {

                        //Shows Receive image when payment is received
                        if(content.PaymentState=="Receive"){
                            Icon(painter = painterResource(id = R.drawable.recieved),
                                contentDescription ="Sent" ,
                                tint = Color(0xFFA488EE),
                                modifier=Modifier.size(18.dp))
                        }

                        Icon(painter = painterResource(id = R.drawable.rupee),
                            contentDescription ="",
                            tint = Color.White,
                            modifier = Modifier.size(20.dp))
                        Text(text = content.price,
                            color = Color.White,
                            fontSize = 14.sp,
                            fontFamily = FontFamily(Font(R.font.inter_bold)),
                            modifier = Modifier.align(Alignment.CenterVertically))

                        //Shows Sent image when payment is Sent
                        if(content.PaymentState=="Sent"){
                            Icon(painter = painterResource(id = R.drawable.sent),
                                contentDescription = "sent",
                                tint = Color.White,
                                modifier=Modifier.size(18.dp))
                        }

                    }
                }
            }
        }

    }
}