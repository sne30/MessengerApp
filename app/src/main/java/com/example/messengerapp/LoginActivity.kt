package com.example.messengerapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity: AppCompatActivity(){
    override fun onCreate (savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_login)

        back_to_registartion_textview.setOnClickListener {
            finish()
        }


    }
}

