package kr.co.douchgosum.android.coinpricechecker

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main1.view.*

/**
 * 시세보기 Fragment
 *
 * */
class Main1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main1, container, false)
        Log.d("MyLog2", "onCreateView")
        return view
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLog2", "onPause")
    }

    override fun onStart() {
        super.onStart()
        Log.d("MyLog2", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyLog2", "onResume")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLog2", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLog2", "onDestroy")
    }
}