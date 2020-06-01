package com.mubassyir.submission1jetpack.home

import android.media.Image
import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import com.mubassyir.submission1jetpack.R
import com.mubassyir.submission1jetpack.utils.Data
import kotlinx.android.synthetic.main.fragment_movie.view.*
import org.junit.Assert.*
import org.junit.Rule
import org.junit.Test

class MainActivityTest{

    private val dataMovie = Data.generateMovieData()
    private val dataTvShow = Data.generateTvShowData()

    @get:Rule
    var activityRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun loadMovie(){
        onView(withId(R.id.rv_movie)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataMovie.size))
    }

    @Test
    fun loadDetailMovie(){
        onView(withId(R.id.rv_movie)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0,click()))
        onView(withId(R.id.movie_title)).check(matches(isDisplayed()))
        onView(withId(R.id.movie_title)).check(matches(withText(dataMovie[0].title)))
        onView(withId(R.id.release_date)).check(matches(isDisplayed()))
        onView(withId(R.id.release_date)).check(matches(withText(dataMovie[0].release)))
        onView(withId(R.id.movie_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.movie_rating)).check(matches(withText(dataMovie[0].rating)))
        onView(withId(R.id.movie_description)).check(matches(isDisplayed()))
        onView(withId(R.id.movie_description)).check(matches(withText(dataMovie[0].description)))
        onView(withId(R.id.toolbar)).perform(click())

    }

    @Test
    fun loadTvShow(){
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rv_tv_show)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tv_show)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dataTvShow.size))
    }

    @Test
    fun loadTvShowDetail(){
        onView(withText("TV SHOW")).perform(click())
        onView(withId(R.id.rv_tv_show)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))
        onView(withId(R.id.movie_title)).check(matches(isDisplayed()))
        onView(withId(R.id.movie_title)).check(matches(withText(dataTvShow[0].title)))
        onView(withId(R.id.release_date)).check(matches(isDisplayed()))
        onView(withId(R.id.release_date)).check(matches(withText(dataTvShow[0].release)))
        onView(withId(R.id.movie_rating)).check(matches(isDisplayed()))
        onView(withId(R.id.movie_rating)).check(matches(withText(dataTvShow[0].rating)))
        onView(withId(R.id.movie_description)).check(matches(isDisplayed()))
        onView(withId(R.id.movie_description)).check(matches(withText(dataTvShow[0].description)))
        onView(withId(R.id.toolbar)).perform(click())
   }

}