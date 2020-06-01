package com.mubassyir.submission1jetpack.data

import android.os.Parcel
import android.os.Parcelable

data class TvShowEntity(
    var id:Int=0,
    var title: String? ="",
    var rating: String? ="",
    var release: String? ="",
    var description: String? ="",
    var cover: Int= 0)
