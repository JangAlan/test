package com.alan.test_online.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TvShowSeasonEntity(
        var showId: Long,
        var sessionId: Int,
        var sessionPremiere: String,
        var totalEpisode: Int,
        var sessionOverview: String,
        var posterURL: String
): Parcelable
