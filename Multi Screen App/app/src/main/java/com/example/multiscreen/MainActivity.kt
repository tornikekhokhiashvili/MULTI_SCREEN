package com.example.multiscreen

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    lateinit var buttonForward: Button
    lateinit var buttonback:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "onCreate: MainActivity")
        buttonForward=findViewById(R.id.Button_Forward)
        buttonForward.setOnClickListener {
            val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
        buttonback=findViewById(R.id.Button_Back)
        buttonback.setOnClickListener {
            finish()
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: MainActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: MainActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: MainActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: MainActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: MainActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: MainActivity")
    }
}