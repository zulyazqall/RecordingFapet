package com.aza.fapet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen

class RecordMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContentView(R.layout.activity_record_menu)

        val induk : CardView = findViewById(R.id.cardView)

        induk.setOnClickListener{
            val intent = Intent(this, IndukFormActivity::class.java)
            startActivity(intent)
        }
    }
}