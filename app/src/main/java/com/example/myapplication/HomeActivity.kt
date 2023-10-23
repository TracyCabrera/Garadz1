package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.myapplication.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

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
        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){
                R.id.home -> replaceFragment(homeFragment)
                R.id.location -> replaceFragment(locationFragment)
                R.id.history -> replaceFragment(historyFragment)
                R.id.profile -> replaceFragment(profileFragment)

            }
            true

        }
    }

        fun replaceFragment(fragment: Fragment) =
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView, fragment)
                commit()
            }
        }