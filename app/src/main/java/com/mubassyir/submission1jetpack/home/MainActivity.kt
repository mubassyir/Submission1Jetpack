package com.mubassyir.submission1jetpack.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mubassyir.submission1jetpack.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mFragmentManager = supportFragmentManager
        val sectionsPagerAdapter =
            SectionsPagerAdapter(this, mFragmentManager)
        view_pager.adapter = sectionsPagerAdapter
        tabs.setupWithViewPager(view_pager)
        supportActionBar?.elevation = 0f
    }
}
