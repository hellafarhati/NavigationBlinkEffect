package fr.bilog.customlibrarynav.mainFragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import fr.bilog.customlibrarynav.R
import fr.bilog.customlibrarynav.animation.BlinkEffect
import kotlinx.android.synthetic.main.fragment_ideas.*

class IdeasFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ideas, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initUI()
    }

    fun initUI() {

        testBlinkBtn.setOnClickListener {
            BlinkEffect.blink(it)
        }


    }

}