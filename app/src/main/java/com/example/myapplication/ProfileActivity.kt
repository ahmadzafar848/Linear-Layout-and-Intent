package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val txtName=findViewById<TextView>(R.id.txtReceviedName)
        val newName=intent.getStringExtra("nameKey")
        Log.i("TAG23",newName.toString())
        txtName.text=newName
    }
}