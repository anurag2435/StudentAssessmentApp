package com.example.studentassessmentapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dashboard.*
import kotlinx.android.synthetic.main.activity_main.*

class dashboardfinal : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
var action=supportActionBar
        action!!.title="Dashboard"
        feesbtn.setOnClickListener{
            val address = action.toString()
            val i = Intent()
            i.action=Intent.ACTION_VIEW
            i.data= Uri.parse("https://fees.rungta.ac.in")
            startActivity(i)
        }
        atbtn.setOnClickListener{
            val i = Intent(this,AttendanceF::class.java)
            startActivity(i)
        }
        QuizButton.setOnClickListener{
            val i = Intent(this, Quizz::class.java)
            startActivity(i)
        }
        NotButton.setOnClickListener{
            val i = Intent(this,NotIceF::class.java)
            startActivity(i)
        }
        assButton.setOnClickListener{
            val i = Intent(this,AssignmentF::class.java)
            startActivity(i)
        }
        GroupButton.setOnClickListener{
            val i = Intent(this,Grp::class.java)
            startActivity(i)
        }
    }
}