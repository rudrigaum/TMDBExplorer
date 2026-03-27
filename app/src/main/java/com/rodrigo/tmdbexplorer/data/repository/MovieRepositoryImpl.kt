package com.rodrigo.tmdbexplorer.data.repository

import com.rodrigo.tmdbexplorer.core.util.Constants
import com.rodrigo.tmdbexplorer.data.remote.api.TmdbApiService
import com.rodrigo.tmdbexplorer.data.remote.model.toDomain
import com.rodrigo.tmdbexplorer.domain.model.Movie
import com.rodrigo.tmdbexplorer.domain.repository.MovieRepository

class MovieRepositoryImpl(
    private val apiService: TmdbApiService
) : MovieRepository {

    override suspend fun getTrendingMovies(): List<Movie> {
        val response = apiService.getTrendingMovies(apiKey = Constants.API_KEY)
        return response.results.map { it.toDomain() }
    }
}