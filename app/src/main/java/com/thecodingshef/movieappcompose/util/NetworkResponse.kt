package com.thecodingshef.movieappcompose.util

sealed class NetworkResponse<T>(
    val data: T? = null,
    val message: String? = null
) {

    class Success<T>(data: T?) : NetworkResponse<T>(data)

    class Loading<T> : NetworkResponse<T>()

    class Error<T>(message: String?) : NetworkResponse<T>(message = message)
}