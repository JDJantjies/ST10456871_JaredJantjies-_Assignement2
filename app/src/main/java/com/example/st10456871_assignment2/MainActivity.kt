package com.example.st10456871_assignment2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var PressToPlayButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PressToPlayButton = findViewById<Button>(R.id.pressToPlayButton)



        PressToPlayButton.setOnClickListener {
            // create the explicit intent
            val intent = Intent(this, Game::class.java)

            // start your next activity
            startActivity(intent)
        }
    }
}