package com.example.huytoapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_detail_home.*

class DetailHomeFragment : Fragment() {

    var listDataHuyet: ArrayList<DataHuyet> = arrayListOf(
        DataHuyet(id = 1, color = "#FFEB3B", nameHuyet = "Thừa Khấp"),
        DataHuyet(id = 2, color = "#FFEB3B", nameHuyet = "Thừa Khấp"),
        DataHuyet(id = 1, color = "#89F809", nameHuyet = "Nhân trung"),
        DataHuyet(id = 2, color = "#89F809", nameHuyet = "Phủ đột"))
    var touchData: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
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
        onPushDataHuyet(idButton = buttonDenHuyet, dataHuyetDao = "Thừa Khấp")
        onPushDataHuyet(idButton = buttonXanhHuyet, dataHuyetDao = "Nhân Trung")
    }

    fun onPushDataHuyet(dataHuyetDao: String?, idButton: Button){
        idButton.setOnClickListener {
            var bundle = Bundle().apply {
                putString("phacdo", dataHuyetDao)
            }
            Navigation.findNavController(it).navigate(R.id.phacDoHuyetFragment, bundle)
        }
    }


    companion object {
        @JvmStatic
        fun newInstance() = DetailHomeFragment()
    }
}

class DataHuyet(var id: Int?, var color: String?, var nameHuyet: String?)

