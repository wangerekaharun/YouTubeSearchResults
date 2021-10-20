package ke.co.appslab.gradleplugins.data.repository

import androidx.paging.PagingSource
import ke.co.appslab.gradleplugins.data.network.YouTubeAPI
import retrofit2.HttpException
import java.io.IOException

class YouTubePagingSource(private val youTubeAPI: YouTubeAPI): PagingSource<String, String>() {
    override suspend fun load(params: LoadParams<String>): LoadResult<String, String> {
        return try {
            val response = youTubeAPI.getVideos("ronaldo")
            var videos = ""
            if (response.isSuccessful) {
                val htmlVideo = response.body()!!
                val videoRegex = Regex("videoId (.*?)[.]")
                val ids = videoRegex.findAll(htmlVideo)
                videos = ids.map { it.groupValues[1] }.joinToString()
            }
            LoadResult.Page(
                videos.split(":"),
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