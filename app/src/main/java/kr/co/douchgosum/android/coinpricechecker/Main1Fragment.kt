package kr.co.douchgosum.android.coinpricechecker

import android.os.Bundle
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
        view.btn_1.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_main1Fragment_to_main2Fragment)
        }
        return view
    }


}