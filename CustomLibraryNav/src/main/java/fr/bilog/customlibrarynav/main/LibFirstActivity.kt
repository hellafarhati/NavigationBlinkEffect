package fr.bilog.customlibrarynav.main

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import fr.bilog.customlibrarynav.R

class LibFirstActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lib_first)
        initListener()



    }


    fun initListener(){
        findViewById<Button>(R.id.nextActBtn).setOnClickListener {
            try {
                val intent =
                    Intent(this, Class.forName("fr.bilog.customlibrarynav.main.LibSecondActivity"))
                startActivity(intent)
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
                Log.i("hella","${e.exception?.localizedMessage}")
            }
        }
    }
}