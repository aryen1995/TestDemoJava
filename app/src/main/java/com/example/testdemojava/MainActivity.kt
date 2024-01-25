package com.example.testdemojava

import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.FileProvider
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import java.io.File


class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel1: MainViewModel
    lateinit var imgView: ImageView
    lateinit var btnChange: Button
    lateinit var imgUri: Uri
    private val factsTextView: TextView
        get() = findViewById(R.id.textView)
    private val factsButton: Button
        get() = findViewById(R.id.button)

    private val contrect = registerForActivityResult(ActivityResultContracts.TakePicture())
    {
        imgView.setImageURI(null)
        imgView.setImageURI(imgUri)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imgView = findViewById(R.id.imgView)
        btnChange = findViewById(R.id.btnChange)

        imgUri = createImageUri()!!
        btnChange.setOnClickListener {
            contrect.launch(imgUri)
        }

        mainViewModel1 = ViewModelProvider(this).get(MainViewModel::class.java)
        mainViewModel1.factsLiveData.observe(this, Observer {
            factsTextView.text = it
        })
        factsButton.setOnClickListener {
            mainViewModel1.updateLiveData()
        }

    }

    private fun createImageUri(): Uri? {
        val image = File(applicationContext.filesDir, "camera_photo.png")
        return FileProvider.getUriForFile(
            applicationContext,
            "com.example.testdemojava.fileProvider", image
        )
    }
}