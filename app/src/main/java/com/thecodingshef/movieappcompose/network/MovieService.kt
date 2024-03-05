package com.thecodingshef.movieappcompose.network

import com.thecodingshef.movieappcompose.data.AlbumsResponse
import com.thecodingshef.movieappcompose.data.AlbumsResponseItem
import com.thecodingshef.movieappcompose.data.MovieResponse
import retrofit2.Response
import retrofit2.http.GET

interface MovieService {

    ////https://jsonplaceholder.typicode.com/photos

    @GET("photos")
    suspend fun getMovieData(
    ): Response<List<AlbumsResponseItem>>
}