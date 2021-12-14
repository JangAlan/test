package com.alan.test_online.ui.tvShow

import androidx.lifecycle.ViewModel
import com.alan.test_online.data.TvShowEntity
import com.alan.test_online.data.util.DataDummy

class TvShowViewModel: ViewModel() {
    fun getTvShow(): List<TvShowEntity> = DataDummy.generateTvShow()
}