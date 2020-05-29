package com.example.huytoapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    var isCheckLogin: Boolean? = null
    var pointsFragment = PoinsFragment()
    var note = NoteFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            isCheckLogin = it.getBoolean("check")
        }
    }
    private fun makeCurrentFragment(fragment: Fragment) {
       requireActivity().supportFragmentManager.beginTransaction().apply {
            replace(R.id.homeFragment, fragment)
            commit()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.points -> makeCurrentFragment(pointsFragment)
                R.id.note -> makeCurrentFragment(note)
            }
            true
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
}
