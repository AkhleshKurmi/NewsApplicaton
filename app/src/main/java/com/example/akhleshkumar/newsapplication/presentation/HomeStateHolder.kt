package com.example.akhleshkumar.newsapplication.presentation

import com.example.akhleshkumar.newsapplication.domain.model.Article

data class HomeStateHolder(
    val isLoading: Boolean = false,
    val data: List<Article>? = null,
    val error: String = ""
)