package com.jamesnyakush.template.ui.sample.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jamesnyakush.template.R
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class Sample : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sample_activity)
    }
}