package com.example.birdview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_main.view.*

class MainAdapter : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    var items: MutableList<MainData> = mutableListOf(MainData("Title1", "Content1"),
        MainData("Title2", "Content2"),MainData("Title3", "Content3"))

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = MainViewHolder(parent)


    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holer: MainViewHolder, position: Int) {
        items[position].let { item ->
            with(holer) {
                tvTitle.text = item.title
                tvContent.text = item.content
            }
        }
    }

    inner class MainViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.item_main, parent, false)) {
        val tvTitle = itemView.tv_main_title
        val tvContent = itemView.tv_main_content
    }
}
