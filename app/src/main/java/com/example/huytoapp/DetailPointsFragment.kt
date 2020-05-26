package com.example.huytoapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_detail_points.*

class DetailPointsFragment : Fragment() {

    var dataDetailPoint : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var data = arguments?.getString("detailPoint")
        if ( data!= null){
            detailPoint.text = data.toString()
        }
        return inflater.inflate(R.layout.fragment_detail_points, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        if (dataDetailPoint != null){
//            detailPoint.text = dataDetailPoint.toString()
//        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = DetailPointsFragment()
    }
}
