package com.example.uielements

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CalendarView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*
import java.text.DateFormat
import java.util.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val calendarView = findViewById<CalendarView>(R.id.calendarView) as CalendarView


        button2.setOnClickListener {
            var firstname = getIntent().getStringExtra("First Name")
            var lastname = getIntent().getStringExtra("Last Name")
            var emailadd = getIntent().getStringExtra("Age")
            var ageview = getIntent().getStringExtra("Email")
            var phonenum = getIntent().getStringExtra("Phone Number")

            val calendarView = findViewById<CalendarView>(R.id.calendarView).date.toString()
            val intent = Intent(this@SecondActivity, ThirdActivity::class.java)
            intent.putExtra("Birthday", calendarView)
            intent.putExtra("First Name", firstname)
            intent.putExtra("Last Name", lastname)
            intent.putExtra("Age", ageview)
            intent.putExtra("Email", emailadd)
            intent.putExtra("Phone Number", phonenum)

            startActivity(intent)


        }
    }
}