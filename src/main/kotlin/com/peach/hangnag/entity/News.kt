package com.peach.hangnag.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDate

@Entity
class News(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    title: String,
    content: String,
    imageUrl: String = "",
    viewCount: Int = 0,
    likeCount: Int = 0,
    createDate: LocalDate,
    link: String,
) {
    @Column(length = 2000)
    var title = title
        protected set

    @Column(length = 2000)
    var content = content
        protected set

    @Column(length = 2000)
    var imageUrl = imageUrl
        protected set

    var viewCount = viewCount
        protected set

    var likeCount = likeCount
        protected set

    var createDate = createDate
        protected set

    @Column(length = 2000)
    var link = link
        protected set
}
