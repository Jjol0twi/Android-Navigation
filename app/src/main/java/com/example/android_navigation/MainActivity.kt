package com.example.android_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android_navigation.databinding.ActivityMainBinding

private lateinit var mbinding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mbinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mbinding.root)
    }
}
