package com.example.huytoapp

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.huytoapp.ui.ThongTinBenhNhan.BaseFragment
import kotlinx.android.synthetic.main.fragment_home.*


class HomeFragment : BaseFragment() {
    var isCheckLogin: Boolean? = null
    var pointsFragment = PoinsFragment()
    var note = NoteFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            isCheckLogin = it.getBoolean("check")
        }

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        makeCurrentFragment(pointsFragment)
        // Inflate the layout for this fragment
        (activity as AppCompatActivity).supportActionBar?.title = "Châm Cứu"

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

    fun makeCurrentFragment(fragment: Fragment) {
        requireActivity().supportFragmentManager.beginTransaction().apply {
            replace(R.id.homeFragment, fragment)
            commit()
        }
        Log.d("mess", "thành")
    }

    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()

    }
}
