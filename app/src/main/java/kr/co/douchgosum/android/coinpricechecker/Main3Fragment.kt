package kr.co.douchgosum.android.coinpricechecker

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_main3.view.*

/**
 * 토론방 Fragment
 *
 * */
class Main3Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main3, container, false)
        view.btn_3.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_main3Fragment_to_main4Fragment)
        }
        return view
    }

}