package com.rodrigo.tmdbexplorer.domain.usecase

import com.rodrigo.tmdbexplorer.domain.model.Movie
import com.rodrigo.tmdbexplorer.domain.repository.MovieRepository

class GetTrendingMoviesUseCase(
    private val repository: MovieRepository
) {
    suspend operator fun invoke(): List<Movie> {
        return repository.getTrendingMovies()
    }
}