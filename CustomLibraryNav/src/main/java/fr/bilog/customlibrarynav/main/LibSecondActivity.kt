package fr.bilog.customlibrarynav.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import fr.bilog.customlibrarynav.R
import fr.bilog.customlibrarynav.animation.BlinkEffect

class LibSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lib_second)
        initController()

    }

    fun initController() {

        val bottomNavigationView = findViewById<BottomNavigationView
                >(R.id.bottom_navigation_view)
        val navController = findNavController(R.id.my_nav_host_fragment)
        bottomNavigationView.setupWithNavController(
            navController
        )
    }

}