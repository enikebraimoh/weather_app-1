package com.enike.weatherapp

import android.graphics.Color
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTransparentStatusBar()
    }
    

    private fun setTransparentStatusBar() {
        // Hide the status bar.
        window.decorView.apply {
            systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
            systemUiVisibility =
                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION or View.SYSTEM_UI_FLAG_FULLSCREEN

        }
    }
}