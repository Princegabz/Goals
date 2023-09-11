package com.example.goals

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    // Initialize your database helper class here

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val newGoalButton = findViewById<Button>(R.id.newGoalButton)

        // Set up RecyclerView to display goals
        // Initialize and set an adapter for the RecyclerView

        // Handle the "New Goal" button click to open GoalDetailActivity
        newGoalButton.setOnClickListener {
            val intent = Intent(this, GoalDetailActivity::class.java)
            startActivity(intent)
        }
    }

    // Implement methods to refresh the goal list and handle goal completion/deletion
}
