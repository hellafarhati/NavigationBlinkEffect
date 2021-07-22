package fr.bilog.libraryexample

import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import fr.bilog.customlibrarynav.animation.BlinkEffect
import fr.bilog.customlibrarynav.Navigator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        button.setOnClickListener {
//            BlinkEffect.blink(it)
//            Navigator.navigateToMainActivity(this)
//
//            //test
//            //test
//        }

        initUI()

    }

    fun initUI() {
        // This is used to hide the status bar and make
        // the splash screen as a full screen activity.
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        // we used the postDelayed(Runnable, time) method
        // to send a message with a delayed time.
        Handler().postDelayed({
            Navigator.navigateToMainActivity(this)

        }, 3000) // 3000 is the delayed time in milliseconds.
    }
}