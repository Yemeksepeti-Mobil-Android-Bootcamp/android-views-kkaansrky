package com.example.androidviews

import android.content.Intent
import android.graphics.drawable.AdaptiveIconDrawable
import android.graphics.drawable.Drawable
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat


class MainActivity : AppCompatActivity() {

    lateinit var sliderDotspanel: LinearLayout
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sliderDotspanel = findViewById(R.id.SliderDots);
        button=findViewById(R.id.button)




        setDots(R.drawable.active_dot)

        for (i in 1..2){
            setDots(R.drawable.non_active_dot)

        }

        button.setOnClickListener{
            startActivity(Intent(this,SignInActivity::class.java))
        }
    }
    fun setDots(drawable: Int){
        val imageView = ImageView(this)
        imageView.setImageDrawable(
            ContextCompat.getDrawable(
                applicationContext,
                drawable
            )
        )


        val params = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )

        params.setMargins(10, 0, 10, 0)

        sliderDotspanel.addView(imageView, params)
    }
}