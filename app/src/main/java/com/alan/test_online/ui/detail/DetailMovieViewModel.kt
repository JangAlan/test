package com.alan.test_online.ui.detail

import androidx.lifecycle.ViewModel
import com.alan.test_online.data.MovieEntity
import com.alan.test_online.data.util.DataDummy

class DetailMovieViewModel: ViewModel(){

    private var movieId: Long = 0L

    fun setSelectedMovie(movieId: Long) {
        this.movieId = movieId
    }

    fun getMovies(): MovieEntity {
        lateinit var movie: MovieEntity
        val moviesEntities = DataDummy.generateDummyMovie()
        for (movieEntity in moviesEntities) {
            if (movieEntity.id == movieId) {
                movie = movieEntity
            }
        }
        return movie
    }

}