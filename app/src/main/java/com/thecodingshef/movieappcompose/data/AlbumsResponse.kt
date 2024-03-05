package com.thecodingshef.movieappcompose.data

import com.google.gson.annotations.SerializedName

data class AlbumsResponse(

	@SerializedName("AlbumsResponse")
	val albumsResponse: List<AlbumsResponseItem?>? = null
)

data class AlbumsResponseItem(

	@SerializedName("albumId")
	val albumId: Int? = null,

	@SerializedName("id")
	val id: Int? = null,

	@SerializedName("title")
	val title: String? = null,

	@SerializedName("url")
	val url: String? = null,

	@SerializedName("thumbnailUrl")
	val thumbnailUrl: String? = null
)
