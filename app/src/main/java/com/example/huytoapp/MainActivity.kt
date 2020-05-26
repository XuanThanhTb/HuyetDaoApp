package com.example.huytoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

     var pointsFragment = PoinsFragment()
     var referenceFragment = ReferenceFragment()
     var testFragment =TestFragment()
     var videoFragment = VideoFragment()
     var myMoaFragment = MyMoaFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.points -> makeCurrentFragment(pointsFragment)
                R.id.reference -> makeCurrentFragment(referenceFragment)
                R.id.tests -> makeCurrentFragment(testFragment)
                R.id.videos ->makeCurrentFragment(videoFragment)
                R.id.my_moa -> makeCurrentFragment(myMoaFragment)
            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.frameLayout, fragment)
            commit()
        }
    }
}
