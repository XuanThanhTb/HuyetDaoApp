package com.example.huytoapp

import android.app.AlertDialog
import android.os.Build
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.huytoapp.dp.thong_tin_benh_nhan.Huyet
import com.example.huytoapp.dp.thong_tin_benh_nhan.HuyetDataBase
import com.example.huytoapp.dp.thong_tin_benh_nhan.ButtonHuyetDataBase
import com.example.huytoapp.ui.ButtonHuyet.ButtonHuyetAdapter
import com.example.huytoapp.ui.ThongTinBenhNhan.BaseFragment
import com.example.huytoapp.ui.ThongTinBenhNhan.NotesAdapter
import com.example.huytoapp.ui.ThongTinBenhNhan.toast
import kotlinx.android.synthetic.main.cell_phac_do_huyet.view.*
import kotlinx.android.synthetic.main.fragment_note.*
import kotlinx.android.synthetic.main.fragment_phac_do_huyet.*
import kotlinx.coroutines.launch


class PhacDoHuyetFragment : BaseFragment() {

    var dataHuyetDao: String? = null
    private var huyet: Huyet? = null

    val list: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            dataHuyetDao = it?.getString("phacdo")
            if (dataHuyetDao != null) list.add(dataHuyetDao.toString()) else return@let
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_phac_do_huyet, container, false)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //lỗi
        setUpRecyclerViewListButtonHuyet()
//        launch {
//            context?.let {
//                var listButtonHuyet = ButtonHuyetDataBase(
//                    it
//                ).getButtonHuyetDao().getAllButtonHuyet()
//
//                recyclerViewPhacDo.adapter =
//                    ButtonHuyetAdapter(listButtonHuyet, activity as MainActivity)
//            }
//        }


        button_save_data.setOnClickListener { view ->
            val maBenhNhan = editTextPersonCode.text.toString().trim()
            val tenBenhNhan = editTextPersonName.text.toString().trim()
            val gioiTinh = editTextGioi.text.toString().trim()
            val tuoi = editTextOld.text.toString().trim()
            val chuanDoan = editTextChuanDoan.text.toString().trim()
            if (maBenhNhan.isEmpty()) {
                editTextPersonCode.error = "Chưa có dữ liệu!"
                editTextPersonCode.requestFocus()
                return@setOnClickListener
            }
            if (tenBenhNhan.isEmpty()) {
                editTextPersonName.error = "Chưa có dữ liệu!"
                editTextPersonName.requestFocus()
                return@setOnClickListener
            }
            if (gioiTinh.isEmpty()) {
                editTextGioi.error = "Chưa có dữ liệu!"
                editTextGioi.requestFocus()
                return@setOnClickListener
            }
            if (tuoi.isEmpty()) {
                editTextOld.error = "Chưa có dữ liệu!"
                editTextOld.requestFocus()
                return@setOnClickListener
            }
            if (chuanDoan.isEmpty()) {
                editTextChuanDoan.error = "Chưa có dữ liệu!"
                editTextChuanDoan.requestFocus()
                return@setOnClickListener
            }

            launch {

                context?.let {
                    val mHuyet =
                        Huyet(
                            maBenhNhan,
                            tenBenhNhan,
                            gioiTinh,
                            tuoi,
                            gioiTinh
                        )
                    if (huyet == null) {
                        HuyetDataBase(
                            it
                        ).getHuyetDao().addHuyet(mHuyet)
                        it.toast("Dữ liệu của bệnh nhân đã được lưu!")
                    } else {
                        mHuyet.id = huyet!!.id
                        HuyetDataBase(
                            it
                        ).getHuyetDao().updateHuyet(mHuyet)
                        it.toast("Dữ liệu của bệnh nhân đã được chỉnh sửa!")
                    }
                    val action =
                        PhacDoHuyetFragmentDirections.actionPhacDoHuyetFragmentToHomeFragment() //action chuyển tới màn nào
                    Navigation.findNavController(view).navigate(action)
                }
            }
        }
    }

    private fun deleteHuyet() {
        AlertDialog.Builder(context).apply {
            setTitle("Bạn có chắc chắn xóa nó không?")
            setMessage("Bạn không thể hoàn tác thao tác này :(")
            setPositiveButton("Yes") { _, _ ->
                launch {
                    HuyetDataBase(
                        context
                    ).getHuyetDao().deleteHuyet(huyet!!)
                    val action =
                        PhacDoHuyetFragmentDirections.actionPhacDoHuyetFragmentToHomeFragment()
                    Navigation.findNavController(requireView()).navigate(action)
                }
            }
            setNegativeButton("No") { _, _ ->

            }
        }.create().show()
    }

    private fun setUpRecyclerViewListButtonHuyet() {
//        recyclerViewPhacDo.setHasFixedSize(true)
        recyclerViewPhacDo.layoutManager = LinearLayoutManager(context)
        recyclerViewPhacDo.adapter = PhacDoHuyet(list, activity as MainActivity)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.save_note -> if (huyet != null) deleteHuyet() else context?.toast("Cannot Delete")
        }
        return super.onOptionsItemSelected(item)
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.item_menu_note, menu)
    }

    companion object {

        @JvmStatic
        fun newInstance() = PhacDoHuyetFragment()
    }
}

class PhacDoHuyet(var list: java.util.ArrayList<String>, val activity: MainActivity) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.cell_phac_do_huyet, parent, false)
        var viewHolder = PhacDoViewHoloder(itemView)
        return viewHolder
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is PhacDoViewHoloder) {
            holder.itemView.textHuyetDao.text = list[position]
            holder.itemView.textIndexHuyet.text = "${position + 1}" + "."
        }

        holder.itemView.setOnClickListener {
            val dataContentHuyet = Bundle().apply {
                putString("tenHuyet", list[position])
            }
            Navigation.findNavController(it).navigate(R.id.contentHuyetFragment, dataContentHuyet)
            Toast.makeText(activity, "${list[position]}", Toast.LENGTH_LONG).show()
        }
    }
}

class PhacDoViewHoloder(itemView: View) : RecyclerView.ViewHolder(itemView)