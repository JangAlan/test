package com.alan.test_online.ui.movie

import androidx.lifecycle.ViewModel
import com.alan.test_online.data.MovieEntity
import com.alan.test_online.data.util.DataDummy

class MovieViewModel: ViewModel() {
    fun getMovies(): List<MovieEntity> = DataDummy.generateDummyMovie()
}