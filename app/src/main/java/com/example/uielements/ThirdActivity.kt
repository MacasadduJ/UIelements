package com.example.uielements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        var intent = intent
        val firstname = intent.getStringExtra("First Name")
        val lastname = intent.getStringExtra("Last Name")
        val ageview = intent.getStringExtra("Age")
        val emailadd = intent.getStringExtra("Email")
        val phonenum = intent.getStringExtra("Phone Number")
        val calendarview = intent.getStringExtra("Birthday")

        val callResult = findViewById<TextView>(R.id.callResult)

        callResult.text =
            "First Name: " + firstname + "\nLast Name: " + lastname + "\nAge: " + ageview + "\nBirthday: "+calendarview+ "\nEmail: " + emailadd + "\nPhone Number: " + phonenum


    }
}