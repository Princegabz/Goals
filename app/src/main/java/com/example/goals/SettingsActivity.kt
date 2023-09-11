package com.example.goals

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {

    // Implement SharedPreferences manager class here

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        // Handle theme preference selection (light/dark mode)
        // Handle other user preferences
    }
}
