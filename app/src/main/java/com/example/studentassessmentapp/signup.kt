package com.example.studentassessmentapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.studentassessmentapp.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_signup.*

class signup : AppCompatActivity() {

    private lateinit var binding:ActivitySignupBinding
    private lateinit var firebaseAuth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        firebaseAuth = FirebaseAuth.getInstance()

        binding.signupbtn.setOnClickListener{
            val email = binding.emailid.text.toString()
            val password= binding.password.text.toString()
            val confirmPassword = binding.confirmPass.text.toString()

            if (email.isNotEmpty() && password.isNotEmpty() && confirmPassword.isNotEmpty()) {
                if (password == confirmPassword) {

                    firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener {
                            if (it.isSuccessful) {
                                val intent = Intent(this, MainActivity::class.java)
                                startActivity(intent)
                            } else {
                                Toast.makeText(this, it.exception.toString(), Toast.LENGTH_SHORT).show()
                            }
                        }
                } else {
                    Toast.makeText(this, "password does not match", Toast.LENGTH_SHORT).show()
                }

                } else{
                Toast.makeText(this,"field doestn exist",Toast.LENGTH_SHORT).show()
            }


            }
            binding.loginRedirect.setOnClickListener{
                val loginIntent = Intent(this, MainActivity::class.java)
                startActivity(loginIntent)
                }
        }




        }






