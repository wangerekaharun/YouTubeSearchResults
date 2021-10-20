package ke.co.appslab.gradleplugins.data.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

class YouTubeClient {
    companion object {
        private const val BASE_URL = "https://www.reddit.com/"
        private var retrofit: Retrofit? = null

        fun getClient(): Retrofit {
            when (retrofit) {
                null -> retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(ScalarsConverterFactory.create())
                    .build()
            }
            return retrofit as Retrofit
        }
    }
}