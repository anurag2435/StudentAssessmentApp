package com.example.studentassessmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NotIceF : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_not_ice_f)
        var action=supportActionBar
        action!!.title="Notices"
    }
}