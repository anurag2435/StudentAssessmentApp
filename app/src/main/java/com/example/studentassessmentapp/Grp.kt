package com.example.studentassessmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Grp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grp)
        var action=supportActionBar
        action!!.title="Groups"
    }
}