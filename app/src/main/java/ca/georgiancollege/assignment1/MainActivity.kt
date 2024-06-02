package ca.georgiancollege.assignment1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}

/*
 * File name: Assignment 1
 * Author: Akshit Moudgil
 * StudentID: 200535888
 * Date: June 2, 2024
 * App description: This file contains code and design layout for a Calculator App,
 * created using Android Studio and the Kotlin programming language.
 * Right now, the file contains contains the only the UI of the app.
 * Version information: Version 1
 */