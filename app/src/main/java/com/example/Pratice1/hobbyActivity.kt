package com.example.Pratice1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.Pratice1.adapters.HobbiesAdapter
import com.example.Pratice1.models.Supplier
import kotlinx.android.synthetic.main.activity_hobby.*

class hobbyActivity  : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobby)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = HobbiesAdapter (this,Supplier.hobbies)
        recyclerView.adapter = adapter


    }

}
