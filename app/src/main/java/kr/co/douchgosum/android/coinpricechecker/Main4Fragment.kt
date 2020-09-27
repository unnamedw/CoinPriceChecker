package kr.co.douchgosum.android.coinpricechecker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main4.view.*

/**
 * 설정 Fragment
 *
 * */
class Main4Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main4, container, false)
        view.btn_4.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_main4Fragment_to_main1Fragment)
        }
        return view
    }
}