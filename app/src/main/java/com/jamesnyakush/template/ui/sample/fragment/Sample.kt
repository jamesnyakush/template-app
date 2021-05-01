package com.jamesnyakush.template.ui.sample.fragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.jamesnyakush.template.R
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class Sample : Fragment(R.layout.sample_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}