package com.message.mycalculator

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonContinuee.setOnClickListener{
            val get=editText.text.toString()
            Toast.makeText(this,"Save button clicked and ${get} is the data saved.",Toast.LENGTH_SHORT).show()
            val intent =Intent(this,secondActivity::class.java)
            startActivity(intent)

        }





}
}
