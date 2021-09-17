package com.example.listkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View as View1

class MainActivity : AppCompatActivity() {

    var UserList = arrayListOf<User>(
        User(R.drawable.android, "red", "28", "hello"),
        User(R.drawable.android, "blue", "26", "hi"),
        User(R.drawable.android, "green", "24", "i'm from daegue"),
        User(R.drawable.android, "yellow", "22", "nice to meet you"),
        User(R.drawable.android, "purple", "20", "i'm live in busan"),
        User(R.drawable.android, "white", "18", "come to me"),
        User(R.drawable.android, "black", "68", "water please")
    )
    override fun onCreate(savedInstanceState: Bundle?) { //
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val item = arrayOf("red", "blue", "green", "yellow","purple")
//        listView.adapter = ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, item)
        val Adapter = UserAdapter(this, UserList)
        listview.adapter = Adapter

    }
}