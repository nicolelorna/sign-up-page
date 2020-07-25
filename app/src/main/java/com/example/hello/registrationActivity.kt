package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class registrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRegister.setOnClickListner{
            var firstName=etFirstName.text.toString()
            var lastName=etLastName.text.toString()
            val email=etEmail.text.toString()
            val phoneNumber=etPhoneNumber.text.toString()
            val Password=etPassword.text.toString()
            val passwordConfirmation=et.passwordConfirmation.toString()
        }
    }
}
