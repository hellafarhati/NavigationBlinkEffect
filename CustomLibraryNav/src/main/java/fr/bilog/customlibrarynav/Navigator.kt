package fr.bilog.customlibrarynav

import android.content.Context
import android.content.Intent


object Navigator   {


    fun navigateToMainActivity(context: Context) {
        val intent = Intent(context, LibFirstActivity::class.java)
        context.startActivity(intent)
    }


}