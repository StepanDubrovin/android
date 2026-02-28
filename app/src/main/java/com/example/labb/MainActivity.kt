package com.example.labb

import android.content.Intent
import android.widget.Button
import android.widget.Toast
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var buttonNextActivityCalendar: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        buttonNextActivityCalendar = findViewById(R.id.buttonNextActivityCalendar)

        init()
    }
    fun init() {
        buttonNextActivityCalendar.setOnClickListener {
            try {
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                startActivity(intent)
                Toast.makeText(this, "Запуск календаря", Toast.LENGTH_LONG).show()
            } catch (e: Exception) {
                e.printStackTrace()
                Toast.makeText(this, "Ошибка: ${e.message}", Toast.LENGTH_LONG).show()
            }
        }
    }
}