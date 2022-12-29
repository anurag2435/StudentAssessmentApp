package com.example.studentassessmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Quizz : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizz)
        var action=supportActionBar
        action!!.title="Quiz"
    }
}