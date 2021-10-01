package com.example.domain

data class DomainPostsItem (
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int,
    val isReaded: Boolean = false,
    val isFavorite: Boolean = false
)