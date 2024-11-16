import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
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
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project2.R
import com.example.project2.data.datastore.dataStore
import com.example.project2.presentation.component.GoldCard
import com.example.project2.presentation.component.ListCard
import com.example.project2.presentation.component.SectionHeader
import com.example.project2.presentation.component.TabContent
import com.example.project2.presentation.component.TopBar
import com.example.project2.presentation.component2.MarUpiEmptyScreen

//Scrolling flow
@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ScrollingScreen(viewModel: Screen1ViewModel,
                    IsStatusButtonClicked: Boolean,
                    onclickStatus: () -> Unit,
                    scrollState: LazyListState,
                    modifier: Modifier = Modifier
) {
    LazyColumn (state=scrollState,modifier= Modifier
        .background(Color(0xFF1D1829))){
        item {
            TopBar()
             }
        stickyHeader { //it will not disappear after scroll it will stick at header
            TabContent(
                screen1ViewModel = viewModel,
                modifier
                    .background(
                        brush = Brush.radialGradient( //Background image
                            colors = listOf(Color(0xFF3A1576), Color(0xFF21174A)),
                            center = Offset(500f, 100f),
                            radius = 600f
                        )
                    )
                    .fillMaxWidth()
            )
        }


        when(viewModel.selectedTabIndexed.value){

            //GoldPage
            0->{
                item {
                    GoldCard(modifier= Modifier
                        .fillMaxWidth()
                        .height(190.dp) //Adjust the height of the card
                        .background(
                            brush = Brush.radialGradient( //Background image
                                colors = listOf(Color(0xFF3A1576), Color(0xFF21174A)),
                                center = Offset(500f, 100f),
                                radius = 450f
                            )
                        ))
                }
                stickyHeader {
                    if(scrollState.firstVisibleItemIndex>=3){
                        Column {
                            TabContent(screen1ViewModel = viewModel,
                                modifier
                                    .background(
                                        brush = Brush.radialGradient( //Background image
                                            colors = listOf(Color(0xFF3A1576), Color(0xFF21174A)),
                                            center = Offset(500f, 100f),
                                            radius = 600f
                                        )
                                    )
                                    .statusBarsPadding())
                            ButtonRow(onclickStatus = onclickStatus,
                                modifier
                                    .padding(vertical = 0.dp, horizontal = 4.dp)
                                    .background(color = Color(0xFF1D1829))
                            )
                        }
                        Log.d("yash",IsStatusButtonClicked.toString())

                    }else{
                        ButtonRow(onclickStatus = onclickStatus,
                            modifier.padding(vertical = 8.dp, horizontal = 4.dp))
                    }
                }
                item{
                    SectionHeader(text = "Today")
                }
                items(viewModel.contentList) { content ->
                    ListCard(content = content)
                }
                item{
                    SectionHeader(text = "Yesterday")
                }
                items(viewModel.contentList){
                        content->
                    ListCard(content)
                }
                item{
                    SectionHeader(text = "4 October 2024")
                }
                items(viewModel.contentList){
                        content->
                    ListCard(content)
                }
            }


            //Marupi Page
            1-> {
                if(viewModel.contentList2.isEmpty()){
                    //buttons
                stickyHeader {
                    if(scrollState.firstVisibleItemIndex>=3){
                        Column {
                            TabContent(screen1ViewModel = viewModel,
                                modifier
                                    .background(
                                        brush = Brush.radialGradient( //Background image
                                            colors = listOf(Color(0xFF3A1576), Color(0xFF21174A)),
                                            center = Offset(500f, 100f),
                                            radius = 600f
                                        )
                                    )
                                    .statusBarsPadding())
                            ButtonRow(onclickStatus = onclickStatus,
                                modifier
                                    .padding(vertical = 0.dp, horizontal = 4.dp)
                                    .background(color = Color(0xFF1D1829))
                            )
                        }

                    }else{
                        ButtonRow(onclickStatus = onclickStatus,
                            modifier.padding(vertical = 8.dp, horizontal = 4.dp))
                    }
                }
                    //shows the empty screen no transaction screen when list is empty
                    //change in datastore2 for now
                item{
                    Box(modifier = Modifier.fillMaxSize()){
                        MarUpiEmptyScreen()
                    } }
                }else{
                    //buttons
                    stickyHeader {
                        if(scrollState.firstVisibleItemIndex>=3){
                            Column {
                                TabContent(screen1ViewModel = viewModel,
                                    modifier
                                        .background(
                                            brush = Brush.radialGradient( //Background image
                                                colors = listOf(Color(0xFF3A1576), Color(0xFF21174A)),
                                                center = Offset(500f, 100f),
                                                radius = 600f
                                            )
                                        )
                                        .statusBarsPadding())
                                ButtonRow(onclickStatus = onclickStatus,
                                    modifier
                                        .padding(vertical = 0.dp, horizontal = 4.dp)
                                        .background(color = Color(0xFF1D1829))
                                )
                            }

                        }else{
                            ButtonRow(onclickStatus = onclickStatus,
                                modifier.padding(vertical = 8.dp, horizontal = 4.dp))
                        }}
                item{
                    SectionHeader(text = "Today")
                }
                items(viewModel.contentList2) { content ->
                    MarUpiCardcontent(content = content)
                }
                item{
                    SectionHeader(text = "Yesterday")
                }
                items(viewModel.contentList2){
                        content->
                    MarUpiCardcontent(content = content)
                }


                item{
                    SectionHeader(text = "4 October 2024")
                }
                items(viewModel.contentList2){
                        content->
                    MarUpiCardcontent(content = content)
                }}
            }
//Default click handling
            else->items(viewModel.contentList){
                content->
            ListCard(content)
        }

        }

    }

}
