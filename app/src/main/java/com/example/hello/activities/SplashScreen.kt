package com.example.hello.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.preference.PreferenceManager
import com.example.hello.R

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(baseContext)
        var accessToken = sharedPreferences.getString("ACCESS_TOKEN_KEY", "")

        if (accessToken.isNullOrEmpty()) {
            val intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        } else {
            val intent = Intent(baseContext, CourseActivity::class.java)
            startActivity(intent)
        }
    }
}