package com.aza.fapet.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Induks(
    var strId: String = "0",
    var strAsal: String? = null,
    var intUmur: Int? = 0,
    var doubleBcs: Double? = 0.0
):Parcelable
