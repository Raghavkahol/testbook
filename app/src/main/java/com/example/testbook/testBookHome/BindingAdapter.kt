package com.example.testbook.testBookHome

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.testbook.testBookHome.model.home.Info
import com.example.testbook.testBookHome.module.home.HomeAdapter

@BindingAdapter("recyclerViewAdapter")
fun <T> setRecyclerViewAdapter(recyclerView: RecyclerView, itemList: List<Info>?) {
    if (itemList?.isNullOrEmpty() == true) {
        return
    }
    val adapter = recyclerView.adapter
    if (adapter is HomeAdapter) {
        adapter.mList = itemList
    }
}
