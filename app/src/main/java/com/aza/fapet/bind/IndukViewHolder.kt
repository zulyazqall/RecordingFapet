package com.aza.fapet.bind

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.aza.fapet.model.Induks

class IndukViewHolder (val view: View) : RecyclerView.ViewHolder(view) {
    fun bindItem(induks: Induks) {
        view.apply {
            //get data users
            val asal = "Asal   : ${induks.strAsal}"
            val umur = "Umur : ${induks.intUmur.toString()}"
            val bcs = "BCS    : ${induks.doubleBcs.toString()}"
            //set view
//            tv_asal.text = asal
//            tv_umur.text = umur
//            tv_bcs.text = bcs
        }
    }
}