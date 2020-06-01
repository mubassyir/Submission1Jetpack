package com.mubassyir.submission1jetpack.detail

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.CollapsingToolbarLayout
import com.mubassyir.submission1jetpack.R
import com.mubassyir.submission1jetpack.data.MovieEntity
import com.mubassyir.submission1jetpack.data.TvShowEntity
import com.mubassyir.submission1jetpack.ui.movie.MovieViewModel
import com.mubassyir.submission1jetpack.ui.tv_show.TvShowViewModel
import kotlinx.android.synthetic.main.activity_detail_movie.*


class DetailMovieActivity : AppCompatActivity() {

    private lateinit var appBar:AppBarLayout
    private lateinit var toolbar:Toolbar
    private lateinit var collapsingToolbar:CollapsingToolbarLayout

    companion object{
        const val CLICK_ID = "click_id"
        const val EXTRAS = "extas"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        collapsingToolbarConfig()

        val movieViewModel = ViewModelProvider(this,ViewModelProvider.NewInstanceFactory())[MovieViewModel::class.java]
        val tvShowViewModel = ViewModelProvider(this,ViewModelProvider.NewInstanceFactory())[TvShowViewModel::class.java]


        if(intent.getIntExtra(CLICK_ID,0)==1){
            movieBinding( movieViewModel.movieDetail(intent.getIntExtra(EXTRAS,0)) )
        } else{
            tvShowBinding(tvShowViewModel.detailTvShow(intent.getIntExtra(EXTRAS,0)))
        }
    }

    private fun collapsingToolbarConfig() {

        toolbar = findViewById(R.id.toolbar)
        appBar = findViewById(R.id.app_bar)
        collapsingToolbar = findViewById(R.id.toolbar_layout)

        appBar.addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { _, verticalOffset ->
            if (collapsingToolbar.height + verticalOffset < 2 * ViewCompat.getMinimumHeight(collapsingToolbar)) {
                collapsingToolbar.setCollapsedTitleTextColor(Color.WHITE)
                toolbar.setBackgroundColor(Color.BLACK)
            } else {
                toolbar.setBackgroundColor(Color.TRANSPARENT)
                collapsingToolbar.setExpandedTitleColor(Color.WHITE)
            }
        })
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back)
        toolbar.setNavigationOnClickListener { onBackPressed() }
    }

    private fun tvShowBinding(tvShowDetail: TvShowEntity?) {
        collapsingToolbar.setTitle(tvShowDetail?.title)

        Glide.with(this)
            .load(tvShowDetail?.cover)
            .into(movie_cover)
        movie_title.text = tvShowDetail?.title
        release_date.text = tvShowDetail?.release
        movie_rating.text = tvShowDetail?.rating
        movie_description.text= tvShowDetail?.description
    }

    private fun movieBinding(movieDetail:MovieEntity?) {
        collapsingToolbar.title = movieDetail?.title

        Glide.with(this)
            .load(movieDetail?.cover)
            .into(movie_cover)
        movie_title.text = movieDetail?.title
        release_date.text = movieDetail?.release
        movie_rating.text = movieDetail?.rating
        movie_description.text= movieDetail?.description
    }

}
