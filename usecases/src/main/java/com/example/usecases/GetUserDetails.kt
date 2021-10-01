package com.example.usecases

import com.example.data.common.Resource
import com.example.data.repository.PostsRepository
import com.example.domain.DomainUserDetails

class GetUserDetails(private val postsRepository: PostsRepository) {
    suspend fun invoke(id: Int) : Resource<DomainUserDetails> = postsRepository.getUserDetails(id)
}