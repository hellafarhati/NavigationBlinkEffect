package fr.bilog.libraryexample

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import fr.bilog.customlibrarynav.BlinkEffect
import fr.bilog.customlibrarynav.LibFirstActivity
import fr.bilog.customlibrarynav.Navigator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            BlinkEffect.blink(it)
            Navigator.navigateToMainActivity(this)

            //test
            //test
        }



    }
}