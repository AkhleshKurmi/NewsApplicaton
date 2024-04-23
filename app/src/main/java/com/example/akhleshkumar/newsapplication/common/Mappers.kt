package com.example.akhleshkumar.newsapplication.common

import com.example.akhleshkumar.newsapplication.data.model.ArticleDTO
import com.example.akhleshkumar.newsapplication.domain.model.Article

fun List<ArticleDTO>.toDomain(): List<Article> {
    return map {
        Article(
            content = it.content ?: "",
            description = it.description ?: "",
            title = it.title ?: "",
            urlToImage = it.urlToImage ?: ""
        )
    }
}