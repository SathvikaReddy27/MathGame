package com.techmania.math

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var add : Button
    lateinit var sub : Button
    lateinit var mul : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add = findViewById(R.id.add)
        sub = findViewById(R.id.sub)
        mul = findViewById(R.id.mul)

        add.setOnClickListener {
            val intent = Intent(this@MainActivity,Addition::class.java)
            startActivity(intent)
        }
    }
}