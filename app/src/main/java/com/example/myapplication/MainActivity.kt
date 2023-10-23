package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var locationFragment = LocationFragment()
    private var bookingFragment = BookingFragment()
    private var historyFragment = HistoryFragment()
    private var profileFragment = ProfileFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        /*binding.bottomNavigationView.setOnItemSelectedListener { item ->

            when(item.itemId){
                R.id.home -> {
                    replaceFragment(homeFragment)
                }

                R.id.location -> {
                    replaceFragment(homeFragment)
                }
            }


        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.commit()
    }*/
}
}