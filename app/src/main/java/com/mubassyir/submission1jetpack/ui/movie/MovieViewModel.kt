package com.mubassyir.submission1jetpack.ui.movie

import androidx.lifecycle.ViewModel
import com.mubassyir.submission1jetpack.data.MovieEntity
import com.mubassyir.submission1jetpack.utils.Data

class MovieViewModel : ViewModel(){
    fun getMovie(): List<MovieEntity> = Data.generateMovieData()
    fun movieDetail(id:Int): MovieEntity? = Data.movieDetail(id)
}