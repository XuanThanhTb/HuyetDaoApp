package com.example.huytoapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.huytoapp.ui.ThongTinBenhNhan.BaseFragment
import kotlinx.android.synthetic.main.cell_detail_home_anh_mot.view.*
import kotlinx.android.synthetic.main.fragment_detail_home.*

class DetailHomeFragment : BaseFragment() {

    var listAnh = arrayListOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

    var listDataHuyet: ArrayList<DataHuyet> = arrayListOf(
        DataHuyet(id = 1, color = "#FFEB3B", nameHuyet = "Thừa Khấp"),
        DataHuyet(id = 2, color = "#FFEB3B", nameHuyet = "Thừa Khấp"),
        DataHuyet(id = 1, color = "#89F809", nameHuyet = "Nhân trung"),
        DataHuyet(id = 2, color = "#89F809", nameHuyet = "Phủ đột")
    )

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
        setUpRecyclerViewDetailHome()
//        toolbar_home_title.text = touchData ?: "Chi tiết châm cứu"


    }

    private fun setUpRecyclerViewDetailHome() {
        recyDetailHome.layoutManager = LinearLayoutManager(context)
        recyDetailHome.adapter = AdapterDetailHome(listAnh, activity as MainActivity)
    }

    companion object {
        @JvmStatic
        fun newInstance() = DetailHomeFragment()
    }

    inner class AdapterDetailHome(
        var listAnh: java.util.ArrayList<Int>,
        var activity: MainActivity
    ) :
        RecyclerView.Adapter<RecyclerView.ViewHolder>() {


        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            if (viewType == 1) {
                var itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.cell_detail_home_anh_mot, parent, false)
                return ViewHolderMot(itemView)
            } else if (viewType == 2) {
                var itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.cell_detail_home_anh_hai, parent, false)
                return ViewHolderHai(itemView)
            } else if (viewType == 3) {
                var itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.cell_detail_home_anh_ba, parent, false)
                return ViewHolderBa(itemView)
//        }else if (viewType == 4){
//            var itemView = LayoutInflater.from(parent.context).inflate( R.layout.cell_detail_home_anh_bon, parent,false)
//            return ViewHolderBon(itemView)
            } else if (viewType == 5) {
                var itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.cell_detail_home_anh_nam, parent, false)
                return ViewHolderNam(itemView)
            } else if (viewType == 6) {
                var itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.cell_detail_home_anh_sau, parent, false)
                return ViewHolderSau(itemView)
            } else if (viewType == 7) {
                var itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.cell_detail_home_anh_bay, parent, false)
                return ViewHolderBay(itemView)
            } else if (viewType == 8) {
                var itemView = LayoutInflater.from(parent.context)
                    .inflate(R.layout.cell_detail_home_anh_tam, parent, false)
                return ViewHolderTam(itemView)
            } else return ViewHolderChin(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.cell_detail_home_anh_chin, parent, false)
            )

        }

        override fun getItemCount(): Int = listAnh.size
        override fun getItemViewType(position: Int): Int {
            return if (listAnh[position] == 1) 1
            else if (listAnh[position] == 2) 2
            else if (listAnh[position] == 3) 3
//        else if (listAnh[position] == 4) 4
            else if (listAnh[position] == 5) 5
            else if (listAnh[position] == 6) 6
            else if (listAnh[position] == 7) 7
            else if (listAnh[position] == 8) 8
            else 9
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            if (listAnh[position] == 1) {
                onPushDataHuyet(
                    idButton = holder.itemView.buttonDenHuyet1,
                    dataHuyetDao = "Thừa mang"
                )
            }
            if (listAnh[position] == 2) {

            }
            if (listAnh[position] == 3) {

            }
            if (listAnh[position] == 4) {

            }
            if (listAnh[position] == 5) {

            }
            if (listAnh[position] == 6) {

            }
            if (listAnh[position] == 7) {

            }
            if (listAnh[position] == 8) {

            }
            if (listAnh[position] == 9) {

            }
        }

        fun onPushDataHuyet(dataHuyetDao: String?, idButton: Button?) {
            idButton?.setOnClickListener {
                Toast.makeText(activity, "action", Toast.LENGTH_LONG).show()
//                launch {
//                    context?.let {
//                        if (dataHuyetDao != null) {
//                            val mListButtonHuyet = ButtonHuyet(tenHuyet = dataHuyetDao)
//                            it.toast("Đã thêm dữ liệu!")
//                            ButtonHuyetDataBase(it).getButtonHuyetDao()
//                                .addButtonHuyet(mListButtonHuyet)
//                            val action =
//                                DetailHomeFragmentDirections.actionDetailHomeFragmentToPhacDoHuyetFragment() //action chuyển tới màn nào
//                            Navigation.findNavController(view).navigate(action)
//                        }
//
                var bundleDataHuyet = Bundle().apply {
                    putString("phacdo", dataHuyetDao ?: "data")
                }
                Toast.makeText(activity, "ACTION", Toast.LENGTH_LONG).show()
                Navigation.findNavController(it)
                    .navigate(R.id.phacDoHuyetFragment, bundleDataHuyet)
//                    }
//                }
            }
        }
    }

    inner class ViewHolderMot(itemView: View) : RecyclerView.ViewHolder(itemView)
    inner class ViewHolderHai(itemView: View) : RecyclerView.ViewHolder(itemView)
    inner class ViewHolderBa(itemView: View) : RecyclerView.ViewHolder(itemView)
    inner class ViewHolderBon(itemView: View) : RecyclerView.ViewHolder(itemView)
    inner class ViewHolderNam(itemView: View) : RecyclerView.ViewHolder(itemView)
    inner class ViewHolderSau(itemView: View) : RecyclerView.ViewHolder(itemView)
    inner class ViewHolderBay(itemView: View) : RecyclerView.ViewHolder(itemView)
    inner class ViewHolderTam(itemView: View) : RecyclerView.ViewHolder(itemView)
    inner class ViewHolderChin(itemView: View) : RecyclerView.ViewHolder(itemView)

}

class DataHuyet(var id: Int?, var color: String?, var nameHuyet: String?)






