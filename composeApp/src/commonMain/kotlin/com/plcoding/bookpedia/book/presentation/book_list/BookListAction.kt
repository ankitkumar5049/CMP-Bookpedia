package com.plcoding.bookpedia.book.presentation.book_list

import com.plcoding.bookpedia.book.domain.Book

sealed interface BookListAction {
    data class onSearchQueryChanged(val query: String): BookListAction
    data class onBookClicked(val book: Book): BookListAction
    data class onTabSelected(val index: Int): BookListAction
}