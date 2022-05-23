package com.example.navigation_drawable_menu

import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import com.example.navigation_drawable_menu.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {

    lateinit var blinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.layout.activity_main)
        blinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(blinding.root)
        blinding.img.setOnClickListener {

            blinding.drwarlayout.openDrawer(GravityCompat.START)
            blinding.navigation.setNavigationItemSelectedListener(this)

        }


    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {

        if (R.id.home == item.itemId) {
            Toast.makeText(this, "home", Toast.LENGTH_SHORT).show()
        }
        else if (R.id.home1== item.itemId) {
            Toast.makeText(this, "home1", Toast.LENGTH_SHORT).show()
        }

        else if (R.id.home2== item.itemId) {
            Toast.makeText(this, "home2", Toast.LENGTH_SHORT).show()
        }

        else if (R.id.home3== item.itemId) {
            Toast.makeText(this, "home3", Toast.LENGTH_SHORT).show()
        }


        return false
    }
}