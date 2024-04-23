package com.example.akhleshkumar.newsapplication.domain.repository

import com.example.akhleshkumar.newsapplication.domain.model.Article

interface GetNewsArticleRepo {
    suspend fun getNewsArticle(): List<Article>
}