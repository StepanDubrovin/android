package com.example.labb

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.GridLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    private lateinit var gridMonths: GridLayout
    private lateinit var textViewSelectedMonth: TextView
    private lateinit var buttonNextFourthCalendar: Button
    private lateinit var buttonBackSecondActivity: Button

    private val months = listOf(
        Pair("Янв", "Январь"),
        Pair("Фев", "Февраль"),
        Pair("Мар", "Март"),
        Pair("Апр", "Апрель"),
        Pair("Май", "Май"),
        Pair("Июн", "Июнь"),
        Pair("Июл", "Июль"),
        Pair("Авг", "Август"),
        Pair("Сен", "Сентябрь"),
        Pair("Окт", "Октябрь"),
        Pair("Ноя", "Ноябрь"),
        Pair("Дек", "Декабрь")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        gridMonths = findViewById(R.id.gridMonths)
        textViewSelectedMonth = findViewById(R.id.textViewSelectedMonth)
        buttonNextFourthCalendar = findViewById(R.id.buttonNextFourthCalendar)
        buttonBackSecondActivity = findViewById(R.id.buttonBackSecondActivity)

        buttonBackSecondActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        buttonNextFourthCalendar.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }

        createMonthButtons()
    }

    private fun createMonthButtons() {
        months.forEach { (shortName, fullName) ->
            val button = Button(this).apply {
                text = shortName
                layoutParams = GridLayout.LayoutParams().apply {
                    columnSpec = GridLayout.spec(GridLayout.UNDEFINED, 1f)
                }
                setOnClickListener {
                    onMonthSelected(fullName)
                }
            }

            gridMonths.addView(button)
        }
    }

    private fun onMonthSelected(month: String) {
        textViewSelectedMonth.text = "Выбран месяц: $month"
        textViewSelectedMonth.visibility = TextView.VISIBLE
    }
}