package com.example.soba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.soba.exchange.exchange
import com.example.soba.hide_seek.hide_seek
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        homebar.title = "present for you"

        hideSeekButton.setOnClickListener {
            val intent = Intent(this, hide_seek::class.java)
            startActivity(intent)
        }

        exchangeButton.setOnClickListener {
            val intent = Intent(this, exchange::class.java)
            startActivity(intent)
        }
    }


}
