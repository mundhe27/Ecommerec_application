package com.example.ecomm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class all_shirts : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_shirts)

        val images = listOf<Image>(
            Image("Shirt 1", R.drawable.img1,"dghasgfa"),
            Image("Shirt 2", R.drawable.img2,"gjkfgdfjvf"),
            Image("Shirt 3", R.drawable.img3,"ffjffejfg"),
            Image("Shirt 4", R.drawable.img4,"hgfjsfafgja"),
            Image("Shirt 5", R.drawable.img5,"fgjesfgjegfe"),
            Image("Shirt 6", R.drawable.img6,"hjfdfhdf"),
            Image("shirt 7", R.drawable.img7,"cgsdcasd"),
            Image("Shirt 8", R.drawable.img8,"jajhvcjsac")

        )

        val recyclerView = findViewById<RecyclerView>(R.id.imagesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this,images)
    }
}