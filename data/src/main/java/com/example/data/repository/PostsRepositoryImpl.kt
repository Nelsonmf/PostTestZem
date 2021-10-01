package com.example.data.repository

import com.example.data.common.Resource
import com.example.data.source.DataBaseDataSource
import com.example.data.source.RemoteDataSource
import com.example.domain.DomainPostsItem
import com.example.domain.DomainUserComments
import com.example.domain.DomainUserDetails

class PostsRepositoryImpl(
    private val dataBaseDataSource: DataBaseDataSource,
    private val remoteDataSource: RemoteDataSource
) : PostsRepository {

    override suspend fun getAllPosts(): List<DomainPostsItem> {
        if (dataBaseDataSource.isEmpty()) {
            val posts = remoteDataSource.getAllPosts()
            posts.data?.let {
                dataBaseDataSource.savePosts(it)
            }
        }
        return dataBaseDataSource.getAllPosts()
    }

    override suspend fun getUserDetails(id: Int): Resource<DomainUserDetails> {
        return remoteDataSource.getUserDetails(id)
    }

    override suspend fun getUserComments(id: Int): Resource<DomainUserComments> {
        return remoteDataSource.getUserComments(id)
    }
}