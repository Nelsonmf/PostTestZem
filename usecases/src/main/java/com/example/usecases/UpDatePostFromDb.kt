package com.example.usecases

import com.example.data.repository.DbPostsRepository

class UpDatePostFromDb(private val dbPostsRepository: DbPostsRepository) {
    suspend fun invoke(id: Int, isReaded: Boolean) : Int = dbPostsRepository.upDatePostReadedRepository(id, isReaded)
}