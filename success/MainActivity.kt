package com.example.test

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var list = ArrayList<CatItem>()
        list.add(CatItem(getDrawable(R.drawable.image00)!!, getString(R.string.cat00)))
        list.add(CatItem(getDrawable(R.drawable.image01)!!, getString(R.string.cat01)))
        list.add(CatItem(getDrawable(R.drawable.image02)!!, getString(R.string.cat02)))
        list.add(CatItem(getDrawable(R.drawable.image03)!!, getString(R.string.cat03)))
        list.add(CatItem(getDrawable(R.drawable.image04)!!, getString(R.string.cat04)))
        list.add(CatItem(getDrawable(R.drawable.image05)!!, getString(R.string.cat05)))
        list.add(CatItem(getDrawable(R.drawable.image06)!!, getString(R.string.cat06)))
        list.add(CatItem(getDrawable(R.drawable.image07)!!, getString(R.string.cat07)))
        list.add(CatItem(getDrawable(R.drawable.image08)!!, getString(R.string.cat08)))
        list.add(CatItem(getDrawable(R.drawable.image09)!!, getString(R.string.cat09)))

        val adapter = RecyclerAdapter(list)
        recyclerView.adapter = adapter
    }
}
