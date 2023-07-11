package com.example.myapplication

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    lateinit var visibleButton :Button  //lateinit 프로퍼티를 null 허용으로 선언하지 않고 프로퍼티 초기화를 미루는 늦은 초기화
    lateinit var invisibleButton : Button
    lateinit var logoImageView : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        visibleButton = findViewById(R.id.visibleButton)
//        invisibleButton = findViewById(R.id.invisibleButton)
//        logoImageView = findViewById(R.id.logoImageView)
//
//        visibleButton.setOnClickListener{
//            logoImageView.visibility = View.VISIBLE
//        }
//
//        invisibleButton.setOnClickListener{
//            logoImageView.visibility = View.INVISIBLE
//        }

    }
}


