package com.example.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val name:EditText = findViewById(R.id.editTextText)
        val btn:Button = findViewById(R.id.button)
        btn.setOnClickListener {
            val send:String = name.text.toString()
            var intent:Intent = Intent(this@MainActivity,MainActivity2::class.java)
            intent.putExtra("name",send)
            startActivity(intent)
        }
    }
}