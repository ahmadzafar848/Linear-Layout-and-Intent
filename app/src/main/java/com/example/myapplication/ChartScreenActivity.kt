package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

class ChartScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chart_screen)

        val btnNext=findViewById<ImageButton>(R.id.btnNext)
        btnNext.setOnClickListener {
            val editTextName=findViewById<EditText>(R.id.txtName)
            val name=editTextName.text.toString()
         var intent=   Intent(this,ProfileActivity::class.java)
            intent.putExtra("nameKey",name)
            startActivity(intent)

        }
    }
}