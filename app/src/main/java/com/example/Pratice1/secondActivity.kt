package com.example.Pratice1

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class secondActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_second)

        var bundle : Bundle? = intent.extras
        val mesg = bundle!!.getString("user_input")
        textView2.text = mesg
        Toast.makeText(this,mesg, Toast.LENGTH_SHORT).show()

    }
}