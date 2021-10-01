package com.example.usecases

import com.example.data.repository.DbPostsRepository
import com.example.domain.DomainPostsItem

class GetAllPostsFromDb(private val dbPostsRepository: DbPostsRepository) {
    suspend fun invoke(): List<DomainPostsItem> = dbPostsRepository.getAllPosts()
}