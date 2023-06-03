package com.example.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val change=findViewById<Button>(R.id.Change)
        change.setOnClickListener{
            // add an actvity
            intent= Intent(applicationContext,SecondPage::class.java)
            startActivity(intent)
             }
    }
}