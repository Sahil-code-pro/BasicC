package com.example.Pratice1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        button.setOnClickListener{
            var message: String = editTextTextPersonName.text.toString()

            var intent = Intent(this,secondActivity::class.java)
            intent.putExtra("user_input",message)
            startActivity(intent)

                //Log.i("MainActivity","Button Clicked")
        }
        btnShareToOtherApp.setOnClickListener{
            var message: String = editTextTextPersonName.text.toString()

            var intent = Intent ()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"

            startActivity(Intent.createChooser(intent,"share to :"))

        }

    }

}