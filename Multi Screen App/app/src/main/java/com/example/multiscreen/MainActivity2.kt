package com.example.multiscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    private val TAG = "SecondActivity"
    lateinit var buttonForward: Button
    lateinit var buttonBack:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        Log.d(TAG, "onCreate: SecondActivity")
        buttonForward=findViewById(R.id.Button_Forward)
        buttonForward.setOnClickListener {
            val intent= Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
        buttonBack=findViewById(R.id.Button_Back)
        buttonBack.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: SecondActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: SecondActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: SecondActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: SecondActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: SecondActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: SecondActivity")
    }
}