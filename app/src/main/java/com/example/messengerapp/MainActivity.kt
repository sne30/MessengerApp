package com.example.messengerapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val Email = findViewById<EditText>(R.id.editTextEmail)
//        Email.text.toString()

        registerbutton.setOnClickListener {
            val email = editTextEmail.text.toString()
            val name = editTextName.text.toString()
            val password =  editTextPassword.text.toString()

            Log.d ("MainActivity", "Email:" + email)
            Log.d ("MainActivity", "password: + $password")
            FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener{
                    if (!it.isSuccessful) return@addOnCompleteListener
//                    else if successful
//                    Log.d("Main", "Suceesfully created user with uid: ${it.result.user.uid}")
                }
        }

        textviewbutton.setOnClickListener {
//            Log.d ("MainActivity", "Try to show log activity")
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}