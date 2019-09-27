package com.example.shmibio

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_feedview.*
import kotlinx.android.synthetic.main.activity_main.*

class FeedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedview)

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