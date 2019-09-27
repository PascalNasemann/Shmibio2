package com.example.shmibio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_profileview.*

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profileview)

        BtStart.setOnClickListener (){
            startActivity(Intent(this, StartActivity::class.java))
        }

        BtFeed.setOnClickListener(){
            startActivity(Intent(this, FeedActivity::class.java))
        }

        BtProfil.setOnClickListener(){
            startActivity(Intent(this, ProfileActivity::class.java))
        }
    }

}