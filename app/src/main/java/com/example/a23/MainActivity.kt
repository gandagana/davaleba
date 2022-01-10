package com.example.a23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity(){
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottom)
        val controller = findNavController(R.id.nav_host)
        val fragmentset = setOf<Int>(
            R.id.firstfragment,
            R.id.secondfragment,
            R.id.thirdfragment,
            R.id.fourthfragment)

        setupActionBarWithNavController(controller, AppBarConfiguration(fragmentset))
        bottomNavView.setupWithNavController(controller)


    }


}