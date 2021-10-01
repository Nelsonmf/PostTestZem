package com.example.usecases

import com.example.data.repository.DbPostsRepository

class DeleteAllPostsFromDb(private val dbPostsRepository: DbPostsRepository) {
    suspend fun invoke() = dbPostsRepository.deleteAllPosts()
}