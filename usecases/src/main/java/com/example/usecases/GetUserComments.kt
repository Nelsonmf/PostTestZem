package com.example.usecases

import com.example.data.common.Resource
import com.example.data.repository.PostsRepository
import com.example.domain.DomainUserComments

class GetUserComments(private val postsRepository: PostsRepository) {
    suspend fun invoke(id: Int) : Resource<DomainUserComments> = postsRepository.getUserComments(id)
}