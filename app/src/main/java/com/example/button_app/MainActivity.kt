package com.example.button_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var addbtn:Button
    lateinit var subbtn:Button
    lateinit var sumtxt:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var num = 0
        addbtn = findViewById(R.id.btn1)
        addbtn.setOnClickListener {
            num++
            sumtxt = findViewById(R.id.txt1)
            sumtxt.text = "$num"

        }
        subbtn = findViewById(R.id.btn2)
        subbtn.setOnClickListener {
            num--
            sumtxt = findViewById(R.id.txt1)
            sumtxt.text = "$num"


    }
}}