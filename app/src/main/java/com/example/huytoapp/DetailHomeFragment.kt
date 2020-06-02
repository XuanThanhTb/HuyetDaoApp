package com.example.huytoapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import kotlinx.android.synthetic.main.fragment_detail_home.*


class DetailHomeFragment : Fragment() {

    var touchData: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        val actBar = (activity as AppCompatActivity).supportActionBar
////        actBar?.setDisplayHomeAsUpEnabled(true) // cho hiển thị nút pop
////        actBar?.setDisplayShowHomeEnabled(true)
////        actBar?.setDisplayUseLogoEnabled(false)
////        actBar?.setTitle("Fragment 1 toolbar")
////        actBar?.setHomeAsUpIndicator(R.drawable.ic_baseline_keyboard_backspace_24)
////        actBar?.subtitle = ""
        arguments?.let {
            touchData = it?.getString("detailHome")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if (touchData != null){
            toolbar_home_title.text = touchData
        }else{
            toolbar_home_title.text = "Chi tiết châm cứu"
        }

//        if (touchData != null) (activity as AppCompatActivity).supportActionBar?.title = "${touchData}" else (activity as AppCompatActivity).supportActionBar?.title = "Châm cứu"
    }
    companion object {

        @JvmStatic
        fun newInstance() = DetailHomeFragment()
    }
}
