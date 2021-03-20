package com.example.myapplication

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class character(
                     val nombre : String,
                     val clase : String,
                     val planeta : String
                   ) : Parcelable