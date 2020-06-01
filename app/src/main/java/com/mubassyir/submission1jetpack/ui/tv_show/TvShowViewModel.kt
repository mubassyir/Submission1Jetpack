package com.mubassyir.submission1jetpack.ui.tv_show

import androidx.lifecycle.ViewModel
import com.mubassyir.submission1jetpack.data.TvShowEntity
import com.mubassyir.submission1jetpack.utils.Data

class TvShowViewModel : ViewModel(){
    fun getTvShow():List<TvShowEntity> = Data.generateTvShowData()
    fun detailTvShow(id:Int) = Data.tvShowDetail(id)

}