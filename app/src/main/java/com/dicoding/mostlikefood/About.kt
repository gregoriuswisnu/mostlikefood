package com.dicoding.mostlikefood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class About : AppCompatActivity() {
    private val title: String ="About Me!"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about)
        setActionBarTitle(title)
    }
    private fun setActionBarTitle(title: String){
        supportActionBar?.title = title
    }
}