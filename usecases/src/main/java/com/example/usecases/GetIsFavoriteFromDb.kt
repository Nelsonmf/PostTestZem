package com.example.usecases

import com.example.data.repository.DbPostsRepository
import com.example.domain.DomainPostsItem

class GetIsFavoriteFromDb(private val dbPostsRepository: DbPostsRepository) {
    suspend fun invoke(isFavorite: Boolean) : List<DomainPostsItem> = dbPostsRepository.getFavorite(isFavorite)
}