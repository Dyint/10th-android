package com.example.umc_10th_1_week

import android.graphics.Color
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val happyButton = findViewById<ImageView>(R.id.ichappy)
        val excitingButton = findViewById<ImageView>(R.id.icexciting)
        val commonButton = findViewById<ImageView>(R.id.iccommon)
        val badButton = findViewById<ImageView>(R.id.icbad)
        val angryButton = findViewById<ImageView>(R.id.icangry)
        val happyText = findViewById<TextView>(R.id.happytitle)
        val excitingText = findViewById<TextView>(R.id.excitingtitle)
        val commonText = findViewById<TextView>(R.id.commontitle)
        val badText = findViewById<TextView>(R.id.badtitle)
        val angryText = findViewById<TextView>(R.id.angrytitle)
        fun backwhite() {
            happyText.setTextColor(Color.parseColor("#000000"))
            angryText.setTextColor(Color.parseColor("#000000"))
            commonText.setTextColor(Color.parseColor("#000000"))
            badText.setTextColor(Color.parseColor("#000000"))
            excitingText.setTextColor(Color.parseColor("#000000"))
        }
        happyButton.setOnClickListener {
            backwhite()
            happyText.setTextColor(Color.parseColor("#ffea00"))
        }
        excitingButton.setOnClickListener {
            backwhite()
            excitingText.setTextColor(Color.parseColor("#00ccff"))
        }
        commonButton.setOnClickListener {
            backwhite()
            commonText.setTextColor(Color.parseColor("#ad69fa"))
        }
        badButton.setOnClickListener {
            backwhite()
            badText.setTextColor(Color.parseColor("#5cff8a"))
        }
        angryButton.setOnClickListener {
            backwhite()
            angryText.setTextColor(Color.parseColor("#ff0000"))
        }
    }
}