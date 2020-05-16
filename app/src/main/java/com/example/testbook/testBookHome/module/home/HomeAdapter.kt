package com.example.testbook.testBookHome.module.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.testbook.R
import com.example.testbook.testBookHome.model.home.Info
import kotlinx.android.synthetic.main.course_card_layout.view.*

class HomeAdapter(val context: Context,var mList: List<Info>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return HomeItemViewHolder(LayoutInflater.from(context).inflate(R.layout.course_card_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return mList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is HomeItemViewHolder)
            holder.bindView(mList.get(position))
    }

    internal inner class HomeItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindView(info: Info) {
            itemView.course_title.text = info.titles
            Glide.with(itemView.faculities_image.context).load("http://"+info.classInfo?.facultiesImage)
              .into(itemView.faculities_image)
            info.classInfo?.classFeature?.features?.let {
                itemView.course_info_one.text = it.get(0)?.name
                itemView.course_info_two.text = it.get(1)?.name
                itemView.course_info_three.text = it.get(2)?.name
            }
        }
    }
}
