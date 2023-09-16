package com.example.multiscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity4 : AppCompatActivity() {
    private val TAG = "FourthActivity"
    lateinit var buttonForward: Button
    lateinit var buttonBack: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        Log.d(TAG, "onCreate: FourthActivity")
        buttonForward=findViewById(R.id.Button_Forward)
        buttonForward.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }
        buttonBack=findViewById(R.id.Button_Back)
        buttonBack.setOnClickListener {
            val intent= Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: FourthActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: FourthActivity")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: FourthActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: FourthActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart: FourthActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: FourthActivity")
    }
}