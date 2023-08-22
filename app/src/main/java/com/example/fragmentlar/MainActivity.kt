package com.example.fragmentlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val bFirstFragment = findViewById<Button>(R.id.bt_bos1)
        val bSecondFragmentFragment = findViewById<Button>(R.id.bt_bos2)

        bFirstFragment.setOnClickListener {
            val firstFragment = FirstFragment()
            setFragment(firstFragment)
        }

        bSecondFragmentFragment.setOnClickListener {
            val secondFragment = SecondFragment()
            setFragment(secondFragment)

        }

    }

    private fun setFragment(some: Fragment) {
       supportFragmentManager.beginTransaction().replace(R.id.fr_first, some).commit()
    }

}

