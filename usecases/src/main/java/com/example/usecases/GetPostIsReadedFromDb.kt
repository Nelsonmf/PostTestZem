package com.example.usecases

import com.example.data.repository.DbPostsRepository
import com.example.domain.DomainPostsItem

/**
 * Created by jhon on 19/07/2020
 */
class GetPostIsReadedFromDb(private val dbPostsRepository: DbPostsRepository) {
    suspend fun invoke(id: Int) : List<DomainPostsItem> = dbPostsRepository.getIsReaded(id)
}