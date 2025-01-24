package ru.netology.nmedianew.dto

data class Post (
    val id: Long,
    var likes: Long,
    var shares: Long,
    var views: Long,
    val author: String,
    val date_and_time_of_publication: String,
    val content: String,
    val likeByMe: Boolean,
)
