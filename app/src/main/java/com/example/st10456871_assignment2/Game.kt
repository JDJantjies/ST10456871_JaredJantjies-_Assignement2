package com.example.st10456871_assignment2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Game : AppCompatActivity() {

    lateinit var image: ImageView
    lateinit var feedCountTextView: TextView
    lateinit var playCountTextView: TextView
    lateinit var cleanCountTextView: TextView
    private var feedClickCount: Int = 0
    private var playClickCount: Int = 0
    private var cleanClickCount: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        image = findViewById(R.id.goofy)
        cleanCountTextView = findViewById(R.id.cleanCount)
        playCountTextView = findViewById(R.id.playCount)
        feedCountTextView = findViewById(R.id.feedCount)


        //When button is clicked the image changes to goofy eating
        val FeedButton = findViewById<Button>(R.id.feedButton)
        FeedButton.setOnClickListener {

            //Change image resource when button is clicked
            image.setImageResource(R.drawable.dogeating_removebg_preview)

            //Count amount of times button is clicked
            feedClickCount++
            feedCountTextView.text = "$feedClickCount"
        }

        //When button is clicked the image changes to goofy playing
        val PlayButton = findViewById<Button>(R.id.playButton)
        PlayButton.setOnClickListener {

            //Change image resource when button is clicked
            image.setImageResource(R.drawable.cartoon_dog_playing_ball_13952526_removebg_preview)

            //Count amount of times button is clicked
            playClickCount++
            playCountTextView.text = "$playClickCount"
        }

        //When button is clicked the image changes to goofy being cleaned
        val CleanButton = findViewById<Button>(R.id.cleanButton)
        CleanButton.setOnClickListener {

            //Change image resource when button is clicked
            image.setImageResource(R.drawable.dogbeingcleaned_removebg_preview)

            //Count amount of times button is clicked
            cleanClickCount++
            cleanCountTextView.text = "$cleanClickCount"
        }

    }
}
