package com.mubassyir.submission1jetpack.ui.tv_show


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.mubassyir.submission1jetpack.R
import kotlinx.android.synthetic.main.fragment_tv_show.*

class TvShowFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tv_show, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (activity!=null){
            val viewTvShowAdapter = ViewModelProvider(this, ViewModelProvider.NewInstanceFactory())[TvShowViewModel::class.java]
            val tvShow = viewTvShowAdapter.getTvShow()

            val tvShowAdapter = TvShowAdapter()
            tvShowAdapter.setTvShow(tvShow)

            with(rv_tv_show){
                layoutManager = GridLayoutManager(context,3)
                setHasFixedSize(true)
                adapter = tvShowAdapter
            }

        }
    }

}
