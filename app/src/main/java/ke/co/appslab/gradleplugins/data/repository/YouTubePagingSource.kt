package ke.co.appslab.gradleplugins.data.repository

import android.util.Log
import androidx.paging.PagingSource
import ke.co.appslab.gradleplugins.data.network.YouTubeAPI
import ke.co.appslab.gradleplugins.data.network.YouTubeClient
import retrofit2.HttpException
import java.io.IOException

class YouTubePagingSource(private val youTubeAPI: YouTubeAPI): PagingSource<String, String>() {
    override suspend fun load(params: LoadParams<String>): LoadResult<String, String> {
        return try {
            val response = youTubeAPI.getVideos("ronaldo")
            Log.d("response", response.toString())

            LoadResult.Page(
                 listOf(),
                null,
                null
            )
        } catch (exception: IOException) {
            return LoadResult.Error(exception)
        } catch (exception: HttpException) {
            return LoadResult.Error(exception)
        }
    }
}