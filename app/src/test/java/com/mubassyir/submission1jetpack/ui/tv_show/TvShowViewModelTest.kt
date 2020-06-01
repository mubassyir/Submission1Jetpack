package com.mubassyir.submission1jetpack.ui.tv_show

import com.mubassyir.submission1jetpack.R
import com.mubassyir.submission1jetpack.data.TvShowEntity
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class TvShowViewModelTest{
    private lateinit var tvShowViewModel : TvShowViewModel
    private lateinit var tvShowEntity: TvShowEntity

    @Before
    fun setUp(){
        tvShowViewModel = TvShowViewModel()
        tvShowEntity = TvShowEntity(0,
            "GLASS",
            "4.4 from 5",
            "5/5/2019",
            "Dari trailer-nya, David Dunn, Elijah Price  dan sang psikopat Kevin Wendell berada dalam " +
                    "sebuah tempat yang mungkin saja bisa disebut sebagai pusat rehabilitasi. Namun, " +
                    "yang menjadi pertanyaan adalah siapa yang mengincar siapa? David Dunn seperti terlihat " +
                    "ingin menyelesaikan sebuah masalahnya dengan The Beast, salah satu kepribadian milik Kevin." +
                    "Sementara itu Elijah Price yang dikenal memiliki IQ diatas rata-rata berada di tengah-" +
                    "tengahnya, berusaha tampil sebagai sosok misterius yang diklaim memegang rahasia Dunn " +
                    "maupun Kevin. Namun, Elijah Price tampaknya ikut terlibat dalam kekacuaan yang membuat " +
                    "suasana di sebuah fasilitas rehabilitasi menjadi berantakan." +
                    "Lalu, apa sebenarnya tujuan dari masing-masing karakterkter ini? Siapa Elijah Price " +
                    "sebenarnya? Bagaimana David Dunn memperoleh kekuatannya? Lalu, apa latar belakang " +
                    "Kevin bisa memiliki kepribadian yang jumlahnya tidak terhingga. Semuanya mungkin " +
                    "saja akan terungkap di film Glass." +
                    "Buat kamu yang belum memahami sosok Elijah Price alias Mr. Glass dan David Dunn, " +
                    "BookMyShow akan sedikit mengungkapkan pertemuan mereka di film Unbreakable. ",
            R.drawable.poster_glass)
    }

    @Test
    fun getTvShow(){
        assertNotNull(tvShowEntity)
        assertEquals(10,tvShowViewModel.getTvShow().size)
    }

    @Test
    fun detaiTvShow() {

   //   assertEquals(Expected Value, text Value)
        assertEquals(tvShowEntity.id,tvShowViewModel.detailTvShow(0).id)
        assertEquals(tvShowEntity.title,tvShowViewModel.detailTvShow(0).title)
        assertEquals(tvShowEntity.release,tvShowViewModel.detailTvShow(0).release)
        assertEquals(tvShowEntity.rating,tvShowViewModel.detailTvShow(0).rating)
        assertEquals(tvShowEntity.description,tvShowViewModel.detailTvShow(0).description)
        assertEquals(tvShowEntity.cover,tvShowViewModel.detailTvShow(0).cover)
    }


}








