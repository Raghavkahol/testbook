package com.example.testbook.testBookHome.module.home

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.testbook.R
import com.example.testbook.testBookHome.model.home.Info
import kotlinx.android.synthetic.main.course_card_layout.view.*
import android.graphics.drawable.GradientDrawable
import android.graphics.Color
import com.example.testbook.testBookHome.AppConstants

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
            itemView.background = getBackgroundDrawable(info.classProperties?.color)
            itemView.course_title.text = info.titles
            val url : String? = context.getString(R.string.label_faculty_url,info.classInfo?.facultiesImage)
            Glide.with(itemView.faculities_image.context).load(url).into(itemView.faculities_image)
            info.classInfo?.classFeature?.features?.let {
                itemView.course_info_one.text = it.get(AppConstants.NUM_ZERO)?.name
                itemView.course_info_two.text = it.get(AppConstants.NUM_ONE)?.name
                itemView.course_info_three.text = it.get(AppConstants.NUM_TWO)?.name
            }
        }

        fun getBackgroundDrawable(color : String?) : GradientDrawable {
            val colorLight : Int = Color.parseColor(context.getString(R.string.label_color_code, color))
            val colorDark : Int = manipulateColor(colorLight)
            val colors = intArrayOf(colorLight, colorDark)
            val gd = GradientDrawable(
                GradientDrawable.Orientation.TL_BR, colors
            )
            gd.gradientType = GradientDrawable.RADIAL_GRADIENT
            gd.setGradientCenter(AppConstants.X_CORDINATE_CIRCLE, AppConstants.Y_CORDINATE_CIRCLE)
            gd.gradientRadius = AppConstants.GRADIENT_RADIUS
            return gd
        }

        fun manipulateColor(colorA : Int) : Int {
            val hsv = FloatArray(AppConstants.NUM_THREE)
            var color = colorA
            Color.colorToHSV(color, hsv)
            hsv[AppConstants.NUM_TWO] *= AppConstants.DARK_COLOR_FACTOR
            color = Color.HSVToColor(hsv)
            return color
        }
    }
}
