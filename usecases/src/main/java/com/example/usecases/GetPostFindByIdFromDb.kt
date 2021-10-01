package com.example.usecases

import com.example.data.repository.DbPostsRepository
import com.example.domain.DomainPostsItem

class GetPostFindByIdFromDb(private val dbPostsRepository: DbPostsRepository) {
    suspend fun invoke(id: Int) : DomainPostsItem = dbPostsRepository.findById(id)
}