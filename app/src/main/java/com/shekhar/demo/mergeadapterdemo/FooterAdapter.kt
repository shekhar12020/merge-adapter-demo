package com.shekhar.demo.mergeadapterdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class FooterAdapter() : RecyclerView.Adapter<ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return LoadingViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_footer, parent, false))
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.item_footer
    }

    override fun getItemCount(): Int {
        return 1
    }

    private inner class LoadingViewHolder(view: View) : RecyclerView.ViewHolder(view.rootView)

}