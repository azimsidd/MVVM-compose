package com.thecodingshef.movieappcompose.repository

import com.thecodingshef.movieappcompose.base.BaseRepository
import com.thecodingshef.movieappcompose.network.MovieService

import javax.inject.Inject


class MovieRepository @Inject constructor(private val apiService: MovieService) : BaseRepository() {

    suspend fun getMovieData() = handleNetworkCall {
        apiService.getMovieData()
    }

}


data class ErrorResponse(
    val message: String
)




