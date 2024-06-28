package com.example.login_project

import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class HomeActivity : AppCompatActivity() {

    val TAG = "HomeActivity_Lifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_home)

        Log.i(TAG, "onCreate()")

        val strData = intent.getStringExtra("dataFromFirstActivity")
        val editId = findViewById<TextView>(R.id.displayId)
        editId.text = strData

        val randomImg = findViewById<ImageView>(R.id.imageView2)
        when(Random.nextInt(1, 6)) {
            1 -> randomImg.setImageResource(R.drawable.yt_home1)
            2 -> randomImg.setImageResource(R.drawable.yt_home2)
            3 -> randomImg.setImageResource(R.drawable.yt_home3)
            4 -> randomImg.setImageResource(R.drawable.yt_home4)
            5 -> randomImg.setImageResource(R.drawable.yt_home5)
        }

        val emoji = findViewById<TextView>(R.id.btn_text_emoji)

        emoji.text = "${String(Character.toChars(0x23F9))}"

        val btnExit = findViewById<androidx.constraintlayout.widget.ConstraintLayout>(R.id.btn_exit)
        btnExit.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy()")
    }
}