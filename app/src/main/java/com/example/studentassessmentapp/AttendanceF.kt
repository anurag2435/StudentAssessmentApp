package com.example.studentassessmentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class AttendanceF : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_attendance_f)
        var action=supportActionBar
        action!!.title="Attendance"
    }
}