package com.example.data.source

import com.example.data.common.Resource
import com.example.domain.DomainPostsItem
import com.example.domain.DomainUserComments
import com.example.domain.DomainUserDetails

interface RemoteDataSource {

    suspend fun getAllPosts() : Resource<List<DomainPostsItem>>
    suspend fun getUserDetails(id: Int) : Resource<DomainUserDetails>
    suspend fun getUserComments(id: Int) : Resource<DomainUserComments>
}