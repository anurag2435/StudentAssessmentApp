package com.example.studentassessmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AssignmentF : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assignment_f)
        var action=supportActionBar
        action!!.title="Assignment"
    }
}