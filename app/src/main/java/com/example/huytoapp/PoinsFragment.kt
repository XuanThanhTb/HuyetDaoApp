package com.example.huytoapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cell_fragment_points.view.*
import kotlinx.android.synthetic.main.fragment_poins.*
import java.util.ArrayList

class PoinsFragment : Fragment() {

    val listTouch = arrayListOf<String>("Search", "12 Kinh Chính",
        "12 Bì Bộ", "15 Lạc Mạch",
        "12 Kinh Cân", "12 Kinh Biệt",
        "Bát Mạch Kỳ Kinh","Hệ Thống Tạng Phủ Cơ Quan",
        "Nguyên Lạc Du Mộ Khích", "Ngũ Du Huyệt",
        "Lục Tổng Huyệt", "Bát Hội Huyệt",
        "Bát Mạch Giao Hội Huyệt", "Huyệt Chuẩn Đoán",
        "13 Quỷ Huyệt", "Linh Quy Bát Pháp",
        "Phác Đồ Huyệt Thường Dùng")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_poins, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecyclerViewTouch()
    }

    private fun setUpRecyclerViewTouch() {
        recyclerViewTouch.layoutManager = LinearLayoutManager(context)
        recyclerViewTouch.adapter = MyAdapterTouch(listTouch)
    }

    inner class MyAdapterTouch(var listTouch: ArrayList<String>) :
        RecyclerView.Adapter<RecyclerView.ViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            var itemView = LayoutInflater.from(parent.context).inflate(R.layout.cell_fragment_points, parent, false)
            var viewHolder = TouchViewHolder(itemView)
            return viewHolder
        }

        override fun getItemCount(): Int  = listTouch.size

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            if (holder is TouchViewHolder){
                holder.itemView.touchView.text = listTouch[position]
                holder.itemView.setOnClickListener {
                    var bundle = Bundle().apply {
                        putString("detailHome", listTouch[position])
                    }
                    Navigation.findNavController(it).navigate(R.id.detailHomeFragment, bundle)
                }
            }
        }
    }

    inner class TouchViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}
