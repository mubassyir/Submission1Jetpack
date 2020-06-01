package com.mubassyir.submission1jetpack.ui.movie

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mubassyir.submission1jetpack.R
import com.mubassyir.submission1jetpack.data.MovieEntity
import com.mubassyir.submission1jetpack.detail.DetailMovieActivity
import com.mubassyir.submission1jetpack.detail.DetailMovieActivity.Companion.CLICK_ID
import com.mubassyir.submission1jetpack.detail.DetailMovieActivity.Companion.EXTRAS
import kotlinx.android.synthetic.main.grid_movie.view.*

class MovieAdapter : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>() {

    private var movieEntity = ArrayList<MovieEntity>()

    fun setMovie(i:List<MovieEntity>?){
        if (i==null) return
        this.movieEntity.clear()
        this.movieEntity.addAll(i)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.grid_movie,parent,false)
        return MovieViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movieEntity.size
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val movie = movieEntity[position]
        holder.bind(movie)
    }

    class MovieViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(movie: MovieEntity){
            val movieTitile = movie.title
            with(itemView){
                Glide.with(context)
                    .load(movie.cover)
                    .override(120,150)
                    .into(movie_cover)
                  movie_title.text = movieTitile
                itemView.setOnClickListener{
                    val intent = Intent(context,DetailMovieActivity::class.java)
                    intent.putExtra(EXTRAS,movie.id)
                    intent.putExtra(CLICK_ID,1)
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
}