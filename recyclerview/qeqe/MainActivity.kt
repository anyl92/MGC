package com.example.test

import MyApdater
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_recycler_view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        val datas = Array(100) {
            "chat $it"
        }

        recycler_view.adapter = MyApdater(datas)
        recycler_view.layoutManager = LinearLayoutManager(this)
    }
}