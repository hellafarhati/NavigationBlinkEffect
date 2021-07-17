package fr.bilog.customlibrarynav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LibSecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lib_second)
        initUI()

    }

    fun initUI(){
        findViewById<Button>(R.id.testBlinkBtn).setOnClickListener {
            BlinkEffect.blink(it)
        }
    }
}