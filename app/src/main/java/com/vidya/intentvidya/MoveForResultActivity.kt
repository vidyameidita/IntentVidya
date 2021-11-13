package com.vidya.intentvidya

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_move_for_result.*

class MoveForResultActivity : AppCompatActivity() {
    var rgFood: RadioGroup? = null
    lateinit var radioButton: RadioButton
    private lateinit var btnChoose: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_for_result)

        rgFood = findViewById(R.id.rg_food)
        btnChoose = findViewById(R.id.btn_choose)
        btnChoose.setOnClickListener {
            val selectOption: Int = rg_food!!.checkedRadioButtonId
            radioButton = findViewById(selectOption)

            val intent = Intent (this, MainActivity::class.java)
            val bundle = Bundle ()
            bundle.putString("Makanan", radioButton.text as String?)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }
}
