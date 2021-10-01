package com.example.usecases

import com.example.data.repository.PostsRepository
import com.example.domain.DomainPostsItem

class GetAllPosts(private val postsRepository: PostsRepository) {
    suspend fun invoke(): List<DomainPostsItem> = postsRepository.getAllPosts()
}