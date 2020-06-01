package com.mubassyir.submission1jetpack.data

data class MovieEntity(
    var id:Int=0,
    var title: String? =null,
    var rating: String? =null,
    var release: String? =null,
    var description: String? =null,
    var cover: Int= 0)
