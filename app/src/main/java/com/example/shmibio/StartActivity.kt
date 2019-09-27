package com.example.shmibio

import android.content.ContentValues
import android.content.Intent
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.util.Log.d
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_startview.*

class StartActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startview)

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