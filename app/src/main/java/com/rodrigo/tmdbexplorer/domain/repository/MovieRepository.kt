package com.rodrigo.tmdbexplorer.domain.repository

import com.rodrigo.tmdbexplorer.domain.model.Movie

interface MovieRepository {
    suspend fun getTrendingMovies(): List<Movie>
}