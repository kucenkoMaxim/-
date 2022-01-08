package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText=findViewById<EditText>(R.id.editTextName)

        findViewById<Button>(R.id.Button).setOnClickListener{
            val name =editText.text.toString();


            val intent=Intent(this,SecondActivity::class.java)
            intent.putExtra(SecondActivity.NAME,name)
            startActivity(intent)
        }


    }
}

