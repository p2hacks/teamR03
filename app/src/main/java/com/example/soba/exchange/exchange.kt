package com.example.soba.exchange

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.soba.R
import kotlinx.android.synthetic.main.activity_exchange.*

class exchange : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exchange)


        setSupportActionBar(toolbarExchange)
        val navController = findNavController(R.id.exchange_nav_host_fragment)
        val appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)
    }

    override fun onSupportNavigateUp()
            = findNavController(R.id.exchange_nav_host_fragment).navigateUp()
}
