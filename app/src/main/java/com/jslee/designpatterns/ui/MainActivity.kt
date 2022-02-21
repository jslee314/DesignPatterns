package com.jslee.designpatterns.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.jslee.designpatterns.R
import com.jslee.designpatterns.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        //setTheme(android.R.style.Theme)
        val selectedTheme = "Aquarius"
        when(selectedTheme) {
            "Capricorn" -> setTheme(R.style.Theme_Capricorn)
            "Aquarius" -> setTheme(R.style.Theme_Aquarius)
            "Pisces" -> setTheme(R.style.Theme_Pisces)
            else -> setTheme(R.style.Theme_Aries)
        }

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    }
}