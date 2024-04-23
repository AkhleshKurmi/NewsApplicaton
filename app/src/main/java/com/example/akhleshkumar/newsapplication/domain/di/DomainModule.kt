package com.example.akhleshkumar.newsapplication.domain.di


import com.example.akhleshkumar.newsapplication.data.network.ApiService
import com.example.akhleshkumar.newsapplication.data.repository.GetNewsArticleRepoImpl
import com.example.akhleshkumar.newsapplication.domain.repository.GetNewsArticleRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object DomainModule {
    @Provides
    fun provideGetNewsRepo(apiService: ApiService): GetNewsArticleRepo {
        return GetNewsArticleRepoImpl(apiService = apiService)
    }
}