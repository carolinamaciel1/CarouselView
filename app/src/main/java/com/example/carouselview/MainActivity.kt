package com.example.carouselview

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.viewbinding.ViewBinding
import com.example.carouselview.databinding.ActivityMainBinding
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class MainActivity : AppCompatActivity() {
    val imageList = intArrayOf(R.mipmap.caju, R.mipmap.jaca, R.mipmap.morango, R.mipmap.manga)

    private lateinit var objectBinding:  ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        objectBinding = ActivityMainBinding.inflate(layoutInflater)
        val view =  objectBinding.root
        setContentView(view)

        val carouselLayout = objectBinding.imageCarouselView
        carouselLayout.pageCount = imageList.size
        carouselLayout.setImageListener{position, imageView ->
            imageView.setImageResource(imageList[position])
        }

    }
}