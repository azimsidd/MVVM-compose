package com.thecodingshef.movieappcompose.data

import com.google.gson.annotations.SerializedName

data class MovieResponse(
    @SerializedName("data")
    val movieData: MovieData? = null,
    val message: String? = null,
    val status: String? = null
)

data class MovieData(
    val trending: Trending? = null,
    val albums: List<AlbumsItem?>? = null,
    val charts: List<ChartsItem?>? = null,
    val playlists: List<PlaylistsItem?>? = null
)

data class Album(
    val name: String? = null,
    val id: String? = null,
    val url: String? = null
)

data class ChartsItem(
    val image: List<ImageItem?>? = null,
    val firstname: String? = null,
    val subtitle: String? = null,
    val language: String? = null,
    val id: String? = null,
    val title: String? = null,
    val type: String? = null,
    val explicitContent: String? = null,
    val url: String? = null
)

data class SongsItem(
    val primaryArtists: List<PrimaryArtistsItem?>? = null,
    val image: List<ImageItem?>? = null,
    val year: String? = null,
    val releaseDate: String? = null,
    val album: Album? = null,
    val language: String? = null,
    val label: String? = null,
    val type: String? = null,
    val featuredArtists: List<Any?>? = null,
    val explicitContent: String? = null,
    val url: String? = null,
    val duration: String? = null,
    val playCount: String? = null,
    val name: String? = null,
    val id: String? = null
)

data class PrimaryArtistsItem(
    val image: List<ImageItem?>? = null,
    val role: String? = null,
    val name: String? = null,
    val id: String? = null,
    val type: String? = null,
    val url: String? = null
)

data class PlaylistsItem(
    val image: List<ImageItem?>? = null,
    val lastUpdated: String? = null,
    val firstname: String? = null,
    val subtitle: String? = null,
    val id: String? = null,
    val title: String? = null,
    val type: String? = null,
    val explicitContent: String? = null,
    val userId: String? = null,
    val followerCount: String? = null,
    val url: String? = null,
    val songCount: String? = null
)

data class ImageItem(
    val link: String? = null,
    val quality: String? = null
)

data class AlbumsItem(
    val primaryArtists: List<Any?>? = null,
    val image: List<ImageItem?>? = null,
    val year: String? = null,
    val releaseDate: String? = null,
    val language: String? = null,
    val type: String? = null,
    val explicitContent: String? = null,
    val featuredArtists: List<Any?>? = null,
    val url: String? = null,
    val songCount: String? = null,
    val playCount: String? = null,
    val artists: List<ArtistsItem?>? = null,
    val name: String? = null,
    val id: String? = null,
    val songs: List<Any?>? = null
)

data class Trending(
    val albums: List<AlbumsItem?>? = null,
    val songs: List<SongsItem?>? = null
)

data class ArtistsItem(
    val image: List<ImageItem?>? = null,
    val role: String? = null,
    val name: String? = null,
    val id: String? = null,
    val type: String? = null,
    val url: String? = null
)

