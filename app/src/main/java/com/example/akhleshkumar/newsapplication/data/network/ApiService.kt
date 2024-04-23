package com.example.akhleshkumar.newsapplication.data.network


import com.example.akhleshkumar.newsapplication.data.model.NewsDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    // https://newsapi.org/v2/top-headlines?country=us&apiKey=API_KEY

    @GET("top-headlines")
    suspend fun getNewsArticles(
        @Query("country") country: String = "in",
        @Query("apiKey") apiKey: String = "fc77c98e74744b6fbdb6ba9d9e2dd28e"
    ): Response<NewsDTO>
}