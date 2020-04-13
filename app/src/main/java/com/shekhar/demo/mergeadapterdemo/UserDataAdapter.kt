package com.shekhar.demo.mergeadapterdemo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_main_content.view.*

class UserDataAdapter(var mItemList: ArrayList<UserDataModel>) : RecyclerView.Adapter<UserDataAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_main_content, parent, false))
    }

    override fun onBindViewHolder(viewHolder: ItemViewHolder, position: Int) {
        val item = mItemList[position]
        viewHolder.itemView.personNameTextView.text = item.name
        viewHolder.itemView.mobileNumberTextView.text = item.mobileNumber
    }

    override fun getItemCount(): Int {
        return if (mItemList.size == 0) 0 else mItemList.size
    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.item_main_content
    }

    inner class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view.rootView)

}