import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.project2.Data.model.MarUpiContent
import com.example.project2.data.datastore.dataStore
import com.example.project2.data.datastore.datastore2
import com.example.project2.data.model.Content

class Screen1ViewModel : ViewModel() {
    private val dataStore = dataStore()
    val contentList: List<Content> = dataStore.list
    val contentList2: List<MarUpiContent> =datastore2().list2

    var isStatusButtonClicked = mutableStateOf(false)
        private set

    //for tabs (Gold,Mar upi.....)
    var scrollableRowButtonList= listOf("Gold","Mar UPI","Nek","Loan")
        private set
    var selectedTabIndexed = mutableStateOf(0)
        private set


    fun onStatusButtonClick() {
        isStatusButtonClicked.value = true
    }

    fun onCloseBottomSheet() {
        isStatusButtonClicked.value = false
    }

    //function for tab touch
    fun onClickTab(index: Int){
        selectedTabIndexed.value=index
    }
}
