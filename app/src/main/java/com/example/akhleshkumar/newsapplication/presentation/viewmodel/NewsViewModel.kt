package com.example.akhleshkumar.newsapplication.presentation.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.akhleshkumar.newsapplication.common.utils.Resource
import com.example.akhleshkumar.newsapplication.domain.use_case.GetNewsArticleUseCase
import com.example.akhleshkumar.newsapplication.presentation.HomeStateHolder
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class NewsViewModel @Inject constructor(private val getNewsArticleUseCase: GetNewsArticleUseCase) :
    ViewModel() {
    val articles = mutableStateOf(HomeStateHolder())

    init {
        getNewsArticles()
    }

    fun getNewsArticles() {
        getNewsArticleUseCase().onEach {
            when (it) {
                is Resource.Loading -> {
                    articles.value = HomeStateHolder(isLoading = true)
                }

                is Resource.Error -> {
                    articles.value = HomeStateHolder(error = it.message.toString())
                }

                is Resource.Success -> {
                    articles.value = HomeStateHolder(data = it.data)
                }
            }
        }.launchIn(viewModelScope)
    }
}