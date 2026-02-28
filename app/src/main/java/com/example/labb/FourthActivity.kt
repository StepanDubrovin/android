package com.example.labb

import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.*

class FourthActivity : AppCompatActivity() {
    private lateinit var buttonThirdActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        buttonThirdActivity = findViewById(R.id.buttonThirdActivity)

        buttonThirdActivity.setOnClickListener {
            finish()
        }
    }
}