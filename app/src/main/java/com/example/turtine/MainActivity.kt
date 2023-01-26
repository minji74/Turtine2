package com.example.turtine

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.ImageView
import androidx.core.view.isInvisible
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    lateinit var cb1 : CheckBox
    lateinit var cb2 : CheckBox
    lateinit var cb3 : CheckBox
    lateinit var cb4 : CheckBox
    lateinit var greenView : ImageView
    lateinit var orangeView : ImageView
    lateinit var redView : ImageView

    var sum:Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cb1 = findViewById<CheckBox>(R.id.cb1)
        cb2 = findViewById<CheckBox>(R.id.cb2)
        cb3 = findViewById<CheckBox>(R.id.cb3)
        cb4 = findViewById<CheckBox>(R.id.cb4)
        greenView = findViewById<ImageView>(R.id.greenView)
        orangeView = findViewById<ImageView>(R.id.orangeView)
        redView = findViewById<ImageView>(R.id.redView)

        if (cb1.isChecked){
            sum ++

        }

        if(sum/4 > 0.7) {
            redView.setVisibility(View.INVISIBLE)
            greenView.setVisibility(View.VISIBLE)
            orangeView.setVisibility(View.INVISIBLE)


        }



        }
    }

