package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityHomeBinding

class Host : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private var homeFragment = HomeFragment()
    private var locationFragment = LocationFragment()
    private var bookingFragment = BookingFragment()
    private var historyFragment = HistoryFragment()
    private var profileFragment = ProfileFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(homeFragment)
        /*binding.bottomNavBar.setOn { item ->

            when(item.itemId){
                R.id.home -> {
                    replaceFragment(homeFragment)
                }

                R.id.location -> {
                    replaceFragment(homeFragment)
                }
            }


        }*/
    }

    fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }
}
