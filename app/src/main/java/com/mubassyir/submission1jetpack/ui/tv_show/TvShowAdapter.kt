package com.mubassyir.submission1jetpack.ui.tv_show

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mubassyir.submission1jetpack.R
import com.mubassyir.submission1jetpack.data.TvShowEntity
import com.mubassyir.submission1jetpack.detail.DetailMovieActivity
import com.mubassyir.submission1jetpack.detail.DetailMovieActivity.Companion.EXTRAS
import kotlinx.android.synthetic.main.grid_tv_show.view.*

class TvShowAdapter : RecyclerView.Adapter<TvShowAdapter.TvShowViewHolder>(){
    val tvShowEntity = ArrayList<TvShowEntity>()

    fun setTvShow(i:List<TvShowEntity>?){
        if (i==null) return
        this.tvShowEntity.clear()
        this.tvShowEntity.addAll(i)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TvShowViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.grid_tv_show,parent,false)
        return TvShowViewHolder(view)
    }

    override fun getItemCount(): Int {
        return tvShowEntity.size
    }

    override fun onBindViewHolder(holder: TvShowViewHolder, position: Int) {
       val tvShow = tvShowEntity[position]
        holder.bind(tvShow)
    }

    inner class TvShowViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        fun bind(tvShow : TvShowEntity){
            with(itemView){
                Glide.with(context)
                    .load(tvShow.cover)
                    .override(120,150)
                    .into(tv_show_cover)
                tv_show_title.text = tvShow.title

            itemView.setOnClickListener {
            val intent = Intent(context,DetailMovieActivity::class.java)
                intent.putExtra(EXTRAS,tvShow.id)
                context.startActivity(intent)
                }
            }
        }
    }

}