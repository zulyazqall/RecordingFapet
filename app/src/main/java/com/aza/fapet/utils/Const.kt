package com.aza.fapet.utils

object Const {
    val PATH_COLLECTION = "bcs"
    val PATH_AGE = "intUmur"

    fun setTimeStamp(): Long {
        val time = (-1 * System.currentTimeMillis())
        return time
    }
}