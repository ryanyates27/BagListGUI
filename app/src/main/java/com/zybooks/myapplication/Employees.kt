package com.zybooks.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RelativeLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class Employees : AppCompatActivity() {
    lateinit var colorStatus: Button
    val isGreen = R.color.green

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.employees_list)

        colorStatus = findViewById(R.id.status1)

    }

    fun statusChange(view: View)
    {
        val button1: Button
        var colorChange = 0

        // set button 1 with its id
        button1 = findViewById(R.id.status1)

        if(button1.equals(R.color.red))
        {
                button1.setBackgroundResource(R.color.green)
        }

        if(button1.equals(R.color.green))
            {
                button1.setBackgroundResource(R.color.red)
            }

    }
}