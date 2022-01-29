package com.example.myapplication

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main
            val btn:button=findViewById(R.layout.activity_main)
        btn.setOnClickListener(View.OnClickListener{
            Toast.makeText(Context: this,"SUBMISSION DONE",Toast.LENGTH_SHORT).show()
        })
    }
}