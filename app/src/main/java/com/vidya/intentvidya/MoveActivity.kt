package com.vidya.intentvidya

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MoveActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnBackActivity: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

//        btnBackActivity = findViewById(R.id.btn_back_activity)
//        btnBackActivity.setOnClickListener()

        btnBackActivity = findViewById(R.id.btn_back_activity)
        btnBackActivity.setOnClickListener(this)

    }

    override fun onClick(v:View?) {
        if (v !=null) {
            when (v.id) {
                R.id.btn_back_activity -> run {

                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}

