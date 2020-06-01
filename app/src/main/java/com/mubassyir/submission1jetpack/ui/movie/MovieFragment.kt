package com.mubassyir.submission1jetpack.ui.movie


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.mubassyir.submission1jetpack.R
import kotlinx.android.synthetic.main.fragment_movie.*

class MovieFragment : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        if (activity!=null){
            val viewMovieAdapter = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[MovieViewModel::class.java]
            val movie = viewMovieAdapter.getMovie()

            val movieAdapter = MovieAdapter()
            movieAdapter.setMovie(movie)

            with(rv_movie){
                layoutManager = GridLayoutManager(context,3)
                setHasFixedSize(true)
                adapter = movieAdapter
            }

        }
    }

}
