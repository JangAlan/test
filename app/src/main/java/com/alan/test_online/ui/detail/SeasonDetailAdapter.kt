package com.alan.test_online.ui.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alan.test_online.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.alan.test_online.data.TvShowSeasonEntity
import com.alan.test_online.data.util.Utils.changeStringDateToYear
import com.alan.test_online.databinding.ItemsSeasonDetailBinding

class SeasonDetailAdapter: RecyclerView.Adapter<SeasonDetailAdapter.SeasonViewHolder>() {

    private var listSeason = ArrayList<TvShowSeasonEntity>()

    fun setSeason(seasons: List<TvShowSeasonEntity>?) {
        if (seasons == null) return
        this.listSeason.clear()
        this.listSeason.addAll(seasons)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeasonViewHolder {
        val itemsSeasonDetailBinding = ItemsSeasonDetailBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SeasonViewHolder(itemsSeasonDetailBinding)
    }

    override fun onBindViewHolder(holder: SeasonViewHolder, position: Int) {
        val season = listSeason[position]
        holder.bind(season)
    }

    override fun getItemCount(): Int = listSeason.size


    class SeasonViewHolder(private val binding: ItemsSeasonDetailBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(season: TvShowSeasonEntity) {
            with(binding) {
                val temp1 = "Season ${season.sessionId}"
                seasonNumber.text = temp1

                val temp2 = "${changeStringDateToYear(season.sessionPremiere)}| ${season.totalEpisode} Eps."
                seasonYearAndTotalEpisode.text = temp2

                val temp3 = "Season ${season.sessionId} premiered on ${season.sessionPremiere}."
                seasonPremierDetail.text = temp3

                seasonOverview.text = season.sessionOverview

                Glide.with(itemView.context)
                        .load(season.posterURL)
                        .apply(
                                RequestOptions.placeholderOf(R.drawable.ic_loading)
                                        .error(R.drawable.ic_error))
                        .into(imgPoster)
            }
        }
    }

}