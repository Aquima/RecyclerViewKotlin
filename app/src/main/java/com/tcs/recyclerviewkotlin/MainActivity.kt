package com.tcs.recyclerviewkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnList.setOnClickListener {
            val intent = Intent(this, ListAnimals::class.java)
            startActivity(intent)
            Log.v("SHOW_CONSOLE","Read")
        }
    }
}
