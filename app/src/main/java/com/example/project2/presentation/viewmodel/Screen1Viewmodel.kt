import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.project2.data.datastore.dataStore
import com.example.project2.data.model.Content

class Screen1ViewModel : ViewModel() {
    private val dataStore = dataStore()
    val contentList: List<Content> = dataStore.list

    var isStatusButtonClicked = mutableStateOf(false)
        private set

    fun onStatusButtonClick() {
        isStatusButtonClicked.value = true
    }

    fun onCloseBottomSheet() {
        isStatusButtonClicked.value = false
    }
}
