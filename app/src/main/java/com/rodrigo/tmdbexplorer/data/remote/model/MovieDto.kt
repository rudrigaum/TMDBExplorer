package com.rodrigo.tmdbexplorer.data.remote.model

import com.google.gson.annotations.SerializedName
import com.rodrigo.tmdbexplorer.domain.model.Movie

data class MovieDto(
    @SerializedName("id") val id: Int,
    @SerializedName("title") val title: String,
    @SerializedName("overview") val overview: String,
    @SerializedName("poster_path") val posterPath: String?,
    @SerializedName("vote_average") val voteAverage: Double,
    @SerializedName("release_date") val releaseDate: String
)

fun MovieDto.toDomain(): Movie {
    return Movie(
        id = id,
        title = title,
        overview = overview,
        posterPath = posterPath,
        voteAverage = voteAverage,
        releaseDate = releaseDate
    )
}