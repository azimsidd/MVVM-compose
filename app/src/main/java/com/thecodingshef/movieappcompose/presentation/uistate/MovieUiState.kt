package com.thecodingshef.movieappcompose.presentation.uistate

import com.thecodingshef.movieappcompose.data.AlbumsResponseItem

data class MovieUiState(
    val isLoading: Boolean = false,
    val error: String = "",
    val albums: List<AlbumsResponseItem?> = listOf()
)