package com.example.testbook.testBookHome.module.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.testbook.R
import com.example.testbook.testBookHome.model.home.Info

class HomeAdapter(val context: Context,var mList: List<Info>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return HomeItemViewHolder(LayoutInflater.from(context).inflate(R.layout.course_card_layout, parent, false))
    }

    override fun getItemCount(): Int {
            return mList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if(holder is HomeItemViewHolder)
            holder.bindView(mList.get(position))
    }

    internal inner class HomeItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(info: Info) {

        }
    }

}