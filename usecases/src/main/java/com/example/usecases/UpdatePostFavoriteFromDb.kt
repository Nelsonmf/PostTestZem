package com.example.usecases

import com.example.data.repository.DbPostsRepository

class UpdatePostFavoriteFromDb(private val dbPostsRepository: DbPostsRepository) {
    suspend fun invoke(id: Int, isFavorite: Boolean) : Int = dbPostsRepository.upDatePostFavoriteRepository(id, isFavorite)
}