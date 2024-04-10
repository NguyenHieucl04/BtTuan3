package com.example.myapplication.tuan3

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication.R

class T3ListviewMainActivity : AppCompatActivity() {
    var adapter: T3Adapter?=null
    var ls = ArrayList<T3Contact>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_t3_listview_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.t3Listview)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var lv=findViewById<ListView>(R.id.t3Listview)
        ls.add(T3Contact("Nguyen Van A","20",R.drawable.android))
        ls.add(T3Contact("Nguyen Van B","19",R.drawable.apple))
        ls.add(T3Contact("Nguyen Van C","22",R.drawable.hp))
        ls.add(T3Contact("Nguyen Van D","23",R.drawable.hancock))
        ls.add(T3Contact("Nguyen Van E","24",R.drawable.shank))
        ls.add(T3Contact("Nguyen Van F","29",R.drawable.facebook))
        ls.add(T3Contact("Nguyen Van G","26",R.drawable.kimheesun))
        ls.add(T3Contact("Nguyen Van H","27",R.drawable.microsoft))
        ls.add(T3Contact("Nguyen Van I","25",R.drawable.chrome))
        adapter=T3Adapter(ls, this)
        lv!!.adapter=adapter
    }
}