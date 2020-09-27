package kr.co.douchgosum.android.coinpricechecker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main2.view.*

/**
 * 관련뉴스 Fragment
 *
 * */
class Main2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main2, container, false)
        view.btn_2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_main2Fragment_to_main3Fragment)
        }
        return view
    }

}