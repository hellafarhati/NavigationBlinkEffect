package fr.bilog.customlibrarynav

import android.content.Context
import android.content.Intent
import fr.bilog.customlibrarynav.main.LibFirstActivity


object Navigator   {


    fun navigateToMainActivity(context: Context) {
        val intent = Intent(context, LibFirstActivity::class.java)
        context.startActivity(intent)
    }


}