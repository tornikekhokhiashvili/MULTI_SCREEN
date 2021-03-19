package com.example.myapplication

import android.os.Bundle
import androidx.camera.view.PreviewView
import com.example.myapplication.camera.CameraActivity

/**
 * Main activity of the app.
 * This activity will be launched after tapping on the app icon on the home screen.
 * Put your code here.
 */
class MainActivity : CameraActivity() {

    override lateinit var previewView: PreviewView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        previewView = findViewById(R.id.preview_view)

        // TODO call this method only after Camera permission will be granted.
        //  in case permission denied show toast message with text: 'Camera permission required for app'
        launchCamera()
    }
}
