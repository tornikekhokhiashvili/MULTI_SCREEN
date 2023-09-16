package com.example.multiscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    private val TAG = "ThirdActivity"
    lateinit var buttonForward: Button
    lateinit var buttonBack: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        Log.d(TAG, "onCreate: ThirdActivity")
        buttonForward=findViewById(R.id.Button_Forward)
        buttonForward.setOnClickListener {
            val intent= Intent(this,MainActivity4::class.java)
            startActivity(intent)
        }
        buttonBack=findViewById(R.id.Button_Back)
        buttonBack.setOnClickListener {
            val intent= Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ThirdActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ThirdActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ThirdActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ThirdActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: ThirdActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ThirdActivity")
    }
}