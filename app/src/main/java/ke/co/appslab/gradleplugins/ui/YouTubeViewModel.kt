package ke.co.appslab.gradleplugins.ui

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import androidx.paging.cachedIn
import ke.co.appslab.gradleplugins.data.repository.YouTubeRepo
import kotlinx.coroutines.flow.Flow

class YouTubeViewModel : ViewModel() {
    private val redditRepo = YouTubeRepo()

    fun fetchVideos(): Flow<PagingData<String>> {
        return redditRepo.fetchVideos()
    }
}