package ke.co.appslab.gradleplugins.data.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import ke.co.appslab.gradleplugins.data.network.YouTubeAPI
import ke.co.appslab.gradleplugins.data.network.YouTubeClient
import kotlinx.coroutines.flow.Flow

class YouTubeRepo {
    private val youtubeAPI = YouTubeClient.getClient().create(YouTubeAPI::class.java)

    @OptIn(ExperimentalPagingApi::class)
    fun fetchVideos(): Flow<PagingData<String>> {
        return Pager(
            PagingConfig(pageSize = 40, enablePlaceholders = false, prefetchDistance = 3),
            pagingSourceFactory = { YouTubePagingSource(youTubeAPI = youtubeAPI) }
        ).flow
    }
}