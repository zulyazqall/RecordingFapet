package com.aza.fapet.utils

object Const {
    val PATH_COLLECTION = "bcs"
    val PATH = "intUmur"

    fun setTimeStamp(): Long {
        val time = (-1 * System.currentTimeMillis())
        return time
    }
}