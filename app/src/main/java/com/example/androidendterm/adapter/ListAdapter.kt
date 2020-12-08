package com.example.androidendterm.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.androidendterm.R
import com.example.androidendterm.model.Post
import kotlinx.android.synthetic.main.item_list.view.*

class ListAdapter:RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    private var myList = emptyList<Post>()

inner class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    init {
        itemView.setOnClickListener{
        }

    }
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false))
    }

    override fun getItemCount(): Int {
        return myList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.title_txt.text =myList[position].title
    }

    fun setData(newList:List<Post>){
         myList = newList
        notifyDataSetChanged()
    }
}