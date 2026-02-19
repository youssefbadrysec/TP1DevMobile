package com.example.hellotoast

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Internal state for the tally
    private var scoreValue = 0

    // UI component for the display label
    private lateinit var scoreLabel: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Linking the Kotlin class to your XML layout
        setContentView(R.layout.activity_main)

        // Initializing views using the new XML IDs
        scoreLabel = findViewById(R.id.display_counter_val)
        val msgButton: Button = findViewById(R.id.btn_show_msg)
        val addBtn: Button = findViewById(R.id.btn_add_one)

        // Logic for the popup notification
        msgButton.setOnClickListener {
            val feedback = "Bonjour !"
            Toast.makeText(this, feedback, Toast.LENGTH_SHORT).show()
        }

        // Logic for increasing the number
        addBtn.setOnClickListener {
            incrementTally()
        }
    }

    /**
     * Updates the internal counter and refreshes the UI
     */
    private fun incrementTally() {
        scoreValue += 1
        scoreLabel.text = scoreValue.toString()
    }
}