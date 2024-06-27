package com.example.login_project

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
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

        val randomImg = findViewById<ImageView>(R.id.imageView2)
        when(Random.nextInt(1, 6)) {
            1 -> randomImg.setImageResource(R.drawable.yt_home1)
            2 -> randomImg.setImageResource(R.drawable.yt_home2)
            3 -> randomImg.setImageResource(R.drawable.yt_home3)
            4 -> randomImg.setImageResource(R.drawable.yt_home4)
            5 -> randomImg.setImageResource(R.drawable.yt_home5)
        }

        val strData = intent.getStringExtra("dataFromFirstActivity")
        val editId = findViewById<EditText>(R.id.edit_id)
        editId.setText(strData)

        val btnExit = findViewById<Button>(R.id.btn_exit)
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