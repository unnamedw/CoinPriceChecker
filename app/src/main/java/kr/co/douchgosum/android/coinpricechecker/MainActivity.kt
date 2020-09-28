package kr.co.douchgosum.android.coinpricechecker

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers

/**
 * Fragment 를 가지고 있는 Single Activity
 *
 * */
class MainActivity : AppCompatActivity() {
    private val main1Fragment by lazy { Main1Fragment() }
    private val main2Fragment by lazy { Main2Fragment() }
    private val main3Fragment by lazy { Main3Fragment() }
    private val main4Fragment by lazy { Main4Fragment() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        bottom_nav.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.main1Fragment -> setFragment(main1Fragment)
                R.id.main2Fragment -> setFragment(main2Fragment)
                R.id.main3Fragment -> setFragment(main3Fragment)
                R.id.main4Fragment -> setFragment(main4Fragment)
            }
            true
        }

    }

    private fun setFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment).commit()
    }

    private fun init() {
        setFragment(main1Fragment)
    }

}