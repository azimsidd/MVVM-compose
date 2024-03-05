package com.thecodingshef.movieappcompose.base


import com.thecodingshef.movieappcompose.util.NetworkResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import retrofit2.Response

abstract class BaseRepository {

    suspend fun <T : Any?> handleNetworkCall(
        apiCall: suspend () -> Response<T>
    ): Flow<NetworkResponse<T>> = flow {

        emit(NetworkResponse.Loading())
        val response = apiCall()

        if (response.isSuccessful) {
            val data = response.body()
            emit(NetworkResponse.Success(data))
        } else {
            emit(NetworkResponse.Error(response.message()))
        }

    }.flowOn(Dispatchers.IO)

}