package com.xeinebiu.floating.video.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class VideoItem(
    val id: String,
    val streams: List<Stream>,
    val subtitles: List<Subtitle>,
) : Parcelable
