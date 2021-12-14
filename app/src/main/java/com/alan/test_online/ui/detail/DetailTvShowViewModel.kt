package com.alan.test_online.ui.detail

import androidx.lifecycle.ViewModel
import com.alan.test_online.data.TvShowEntity
import com.alan.test_online.data.util.DataDummy

class DetailTvShowViewModel:ViewModel() {

    private var showId: Long = 0L

    fun setSelectedShow(showId: Long) {
        this.showId = showId
    }

    fun getShows(): TvShowEntity {
        lateinit var show: TvShowEntity
        val showsEntity = DataDummy.generateTvShow()
        for (showEntity in showsEntity) {
            if (showEntity.id == showId) {
                show = showEntity
            }
        }
        return show
    }

}