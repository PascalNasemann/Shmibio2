package com.example.shmibio

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.util.Log.d
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_loginview.*
import kotlinx.android.synthetic.main.activity_main.*

class LoginActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginview)


        Bt_Login_id.setOnClickListener(){
            val benutzernameText = findViewById<EditText>(R.id.EtBenutzername_id)
            val benutzernameTextValue = benutzernameText.text.toString()

            val passwortText = findViewById<EditText>(R.id.Etpasswort_id)
            val passwortTextValue = passwortText.text.toString()

            if(benutzernameTextValue == "Pascal Nasemann" || passwortTextValue == "1234"){
                startActivity(Intent(this, StartActivity::class.java))
                d("JustusSager", "Justus du bist geil")
            }
            else{
                startActivity(Intent(this, ProfileActivity::class.java))
            }
        }


    }
}