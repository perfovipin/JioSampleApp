package com.perfomatix.sampetvapp

import android.R.attr.button
import android.content.Context
import android.util.TypedValue
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.leanback.widget.Presenter
import com.perfomatix.leanback_jioext.Button


class DetailsDescriptionPresenter : Presenter() {

private  var v: Button? = null
    private  var mContext:Context ? = null

    /*override fun onBindDescription(
            viewHolder: AbstractDetailsDescriptionPresenter.ViewHolder,
            item: Any) {
        val movie = item as Movie

        viewHolder.title.text = movie.title
        viewHolder.subtitle.text = movie.studio
        viewHolder.body.text = movie.description
    }*/

    override fun onCreateViewHolder(parent: ViewGroup?): ViewHolder {

        //

        // create a new view
       v =Button(parent?.context)
        v?.background = null
        v?.layoutParams = null
        v?.gravity =Gravity.CENTER
        mContext= parent?.context
        return  ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder?, item: Any?) {
        val movie = item as Movie
        v?.text ="PLAY"
        v?.setOnClickListener {
            Toast.makeText(mContext,"will be released soon ",Toast.LENGTH_SHORT).show()
        }

    }

    override fun onUnbindViewHolder(viewHolder: ViewHolder?) {
        v?.invalidate()
    }
}
