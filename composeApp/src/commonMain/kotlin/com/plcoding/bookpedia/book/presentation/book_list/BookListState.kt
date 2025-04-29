package com.plcoding.bookpedia.book.presentation.book_list

import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.core.presentation.UiText

data class BookListState(
    val searchQuery: String = "kotlin",
    val searchResults: List<Book> = dummyBooks,
    val favoriteBooks: List<Book> = emptyList(),
    val isLoading: Boolean = false,
    val selectedTabIndex: Int = 0,
    val errorMessage: UiText? = null
)

val dummyBooks = (1 .. 100).map{
    Book(
        id = it.toString(),
        title = "Book $it",
        imageUrl = "https://test.com",
        authors = listOf("ankit"),
        description = "Desc $it",
        languages = emptyList(),
        firstPublishYear = null,
        averageRating = 4.34343,
        numPages = 100,
        ratingCount = 5,
        numEditions = 2
    )
}
