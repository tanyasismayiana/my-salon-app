package com.example.mysolonapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnproceed:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnproceed=findViewById(R.id.btnproceed)
        btnproceed.setOnClickListener {
            var intent= Intent(this,loginActivity::class.java)
            startActivity(intent)
        }
    }
}