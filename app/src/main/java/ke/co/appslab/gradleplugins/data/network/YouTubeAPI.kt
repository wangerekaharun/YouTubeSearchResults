package ke.co.appslab.gradleplugins.data.network

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface YouTubeAPI {

    @GET("results")
    suspend fun getVideos(
        @Query("search_query") searchQuery: String
    ): Response<String>
}