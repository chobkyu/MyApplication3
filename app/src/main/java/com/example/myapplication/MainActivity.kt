package com.example.myapplication

import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.KeyEvent
import android.view.View
import android.view.ViewGroup.LayoutParams.WRAP_CONTENT
import android.widget.*
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {

    var initTime = 0L //3초 이내 백버튼을 두번 누르면 종료하기 위해



     override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val tab1 = findViewById<Button>(R.id.tab1);
//        val tab2 = findViewById<Button>(R.id.tab2);
//        val content1 = findViewById<TextView>(R.id.content1);
//        val content2 = findViewById<TextView>(R.id.content2);
//        tab1.setOnClickListener {
//             content1.visibility = View.VISIBLE;
//             content2.visibility = View.INVISIBLE
//        }
//
//        tab2.setOnClickListener {
//             content1.visibility = View.INVISIBLE;
//             content2.visibility = View.VISIBLE
//        }
    }


    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if(keyCode === KeyEvent.KEYCODE_BACK){
            if(System.currentTimeMillis() - initTime > 3000){
                Toast.makeText(this, "종료하려면 한번 더 누르세요!!",Toast.LENGTH_SHORT).show();
                initTime = System.currentTimeMillis();
                return true;
            }
        }
        return super.onKeyDown(keyCode, event)
    }
}


