package com.thecodingshef.movieappcompose.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.thecodingshef.movieappcompose.presentation.uistate.MovieUiState
import com.thecodingshef.movieappcompose.repository.MovieRepository
import com.thecodingshef.movieappcompose.util.NetworkResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class MovieViewModel @Inject constructor(private val repository: MovieRepository) : ViewModel() {


    private val _movieState = MutableStateFlow(MovieUiState())
    val movieUiState: StateFlow<MovieUiState> = _movieState

    init {
        getMovieData("hindi")
    }

    fun getMovieData(language: String) {

        viewModelScope.launch {
            repository.getMovieData().collectLatest { response ->


                Log.d("thecodingshef", "getMovieData: $response")

                when (response) {
                    is NetworkResponse.Loading -> {
                        _movieState.value = MovieUiState(isLoading = true)
                    }

                    is NetworkResponse.Success -> {

                        // val movieResponse = Gson().fromJson(moviewJson, ::class.java)

                        // _movieState.value = MovieUiState(movieData = movieData)

                        response.data?.let {
                            _movieState.value = MovieUiState(albums = it)
                        }
//                        response.moviewlet { movieData ->
//
//                        }
                    }

                    is NetworkResponse.Error -> {
                        _movieState.value = MovieUiState(error = response.message.toString())

                    }
                }

            }
        }
    }
}