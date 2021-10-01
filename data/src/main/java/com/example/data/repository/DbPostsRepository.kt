package com.example.data.repository

import com.example.domain.DomainPostsItem

interface DbPostsRepository {
    suspend fun getAllPosts(): List<DomainPostsItem>
    suspend fun deleteAllPosts()
    suspend fun upDatePostReadedRepository(id: Int, isReaded: Boolean) : Int
    suspend fun getIsReaded(id: Int) : List<DomainPostsItem>
    suspend fun upDatePostFavoriteRepository(id: Int, isFavorite: Boolean) : Int
    suspend fun getIsFavorite(id: Int) : List<DomainPostsItem>
    suspend fun getFavorite(isFavorite: Boolean) : List<DomainPostsItem>
    suspend fun findById(id: Int) : DomainPostsItem
}