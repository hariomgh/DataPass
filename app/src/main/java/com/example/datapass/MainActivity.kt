package com.example.datapass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        const val KEY = "package com.example.datapass.MainActivity.KEY"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        btnOrder.setOnClickListener{
            val ordersPlaced = eT1.text.toString()+" "+eT2.text.toString()+" "+eT3.text.toString()+" "+eT4.text.toString()+" "

            intent = Intent(this, Order::class.java)
            intent.putExtra(KEY, ordersPlaced)
            startActivity(intent)
        }

    }
}