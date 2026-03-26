package com.rodrigo.tmdbexplorer.data.remote.api

import com.rodrigo.tmdbexplorer.data.remote.model.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface TmdbApiService {

    @GET("trending/movie/day")
    suspend fun getTrendingMovies(
        @Query("api_key") apiKey: String,
        @Query("language") language: String = "en-US"
    ): MovieResponse
}