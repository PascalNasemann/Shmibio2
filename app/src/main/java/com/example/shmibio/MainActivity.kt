package com.example.shmibio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Bt_Einloggen_id.setOnClickListener(){
            startActivity(Intent(this, LoginActivity::class.java))
        }

        bt_Registrieren_id.setOnClickListener(){
            d("JustusSager", "Justus du bist geil")
            startActivity(Intent(this, RegistActivity::class.java))
        }
    }
}
