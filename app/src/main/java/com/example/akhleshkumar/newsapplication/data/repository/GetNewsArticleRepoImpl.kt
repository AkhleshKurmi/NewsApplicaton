package com.example.akhleshkumar.newsapplication.data.repository

import com.example.akhleshkumar.newsapplication.common.toDomain
import com.example.akhleshkumar.newsapplication.common.utils.SafeApiRequest
import com.example.akhleshkumar.newsapplication.data.network.ApiService
import com.example.akhleshkumar.newsapplication.domain.model.Article
import com.example.akhleshkumar.newsapplication.domain.repository.GetNewsArticleRepo
import javax.inject.Inject

class GetNewsArticleRepoImpl @Inject constructor(private val apiService: ApiService) :
    GetNewsArticleRepo, SafeApiRequest() {
    override suspend fun getNewsArticle(): List<Article> {
        val response = safeApiRequest { apiService.getNewsArticles() }
        return response.articles?.toDomain()!!
    }
}