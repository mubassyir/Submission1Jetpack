package com.mubassyir.submission1jetpack.ui.movie

import com.mubassyir.submission1jetpack.R
import com.mubassyir.submission1jetpack.data.MovieEntity
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test


class MovieViewModelTest{

    private lateinit var movieViewModel : MovieViewModel
    private lateinit var movieEntity: MovieEntity

   @Before
   fun setuUp() {
       movieViewModel = MovieViewModel()
       movieEntity = MovieEntity(0,
           "A STAR",
           "4.6 from 5",
           "5/5/2019",
           "jack yang merupakan seorang alkoholik kala itu baru saja menyelesaikan konser musiknya." +
                   " Diperjalanan pulang, ia meminta supirnya untuk menepi di sebuah bar karena ia kehabisan" +
                   " minuman beralkohol di mobilnya. Kebetulan sekali di bar tempat ia minum, sedang" +
                   " ada pertunjukkan live music di mana para penyanyinya berdandan layaknya drag queen." +
                   " Awalnya Jack tidak terlalu peduli dengan lingkungan sekitarnya, hingga akhirnya ada" +
                   " seorang penyanyi yang suara dan penampilannya berhasil mencuri perhatian Jack",
           R.drawable.poster_a_star)
   }

    @Test
    fun getMovie(){
        assertNotNull(movieEntity)
        assertEquals(10,movieViewModel.getMovie().size)
    }

    @Test
    fun detailMovie(){
  //    assertEquals(expected value, from viewmodel )
        assertEquals(movieEntity.id,movieViewModel.movieDetail(0)?.id)
        assertEquals(movieEntity.title,movieViewModel.movieDetail(0)?.title)
        assertEquals(movieEntity.rating,movieViewModel.movieDetail(0)?.rating)
        assertEquals(movieEntity.release,movieViewModel.movieDetail(0)?.release)
        assertEquals(movieEntity.description,movieViewModel.movieDetail(0)?.description)
        assertEquals(movieEntity.cover,movieViewModel.movieDetail(0)?.cover)
    }
}