package com.example.carouselview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.carouselview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val imageList = intArrayOf(R.mipmap.caju, R.mipmap.jaca, R.mipmap.morango, R.mipmap.manga)

    private lateinit var objectBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        objectBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = objectBinding.root
        setContentView(view)

        val carouselLayout = objectBinding.imageCarouselView
        carouselLayout.pageCount = imageList.size
        carouselLayout.setImageListener { position, imageView ->
            imageView.setImageResource(imageList[position])
        }

    }
}