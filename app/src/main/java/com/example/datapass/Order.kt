package com.example.datapass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_order.*

class Order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val orderofCustomers = intent.getStringExtra(MainActivity.KEY)
        tvOrder.text = orderofCustomers.toString() +"\n"

    }
}