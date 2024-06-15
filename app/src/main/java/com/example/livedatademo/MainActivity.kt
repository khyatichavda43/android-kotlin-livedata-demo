package com.example.livedatademo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel

    private val myTextview :TextView
        get() = findViewById(R.id.mytextview)
    private val btnUpdate : Button
        get() = findViewById(R.id.btnupdate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainViewModel=ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.myQuoteLiveData.observe(this) {
            //It will execute whenever myQuoteLiveData change
            myTextview.text = it
        }

        btnUpdate.setOnClickListener{
            mainViewModel.updateLiveData()
        }
    }
}