package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    companion object{
        const val NAME="NAME"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)


    val textView=findViewById<TextView>(R.id.text_view_second_activity)
        val name = intent.getStringExtra(NAME)

        textView.text=name


    }
    fun back(view:View) {
        onBackPressed()
    }


}