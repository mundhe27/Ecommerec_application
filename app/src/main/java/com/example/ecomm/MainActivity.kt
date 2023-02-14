package com.example.ecomm
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.ImageButton


class MainActivity : AppCompatActivity() {

    private lateinit var t_shirt: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        t_shirt = findViewById(R.id.t_shirt)

        t_shirt.setOnClickListener {
            val intent = Intent(this,all_shirts::class.java)
            startActivity(intent)

        }




        }
    }












