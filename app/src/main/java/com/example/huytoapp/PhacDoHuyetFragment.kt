package com.example.huytoapp

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.huytoapp.dp.Huyet
import com.example.huytoapp.dp.HuyetDataBase
import com.example.huytoapp.ui.BaseFragment
import com.example.huytoapp.ui.toast
import kotlinx.android.synthetic.main.cell_phac_do_huyet.view.*
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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecyclerView()
        button_save_data.setOnClickListener { view ->
            val maBenhNhan = editTextPersonCode.text.toString().trim()
            val tenBenhNhan = editTextPersonName.text.toString().trim()
            val gioiTinh = editTextGioi.text.toString().trim()
            val tuoi = editTextOld.text.toString().trim()
//            val time =
            if (maBenhNhan.isEmpty()) {
                editTextPersonCode.error = "title required"
                editTextPersonCode.requestFocus()
                return@setOnClickListener
            }
            if (tenBenhNhan.isEmpty()) {
                editTextPersonName.error = "title required"
                editTextPersonName.requestFocus()
                return@setOnClickListener
            }
            if (gioiTinh.isEmpty()) {
                editTextGioi.error = "title required"
                editTextGioi.requestFocus()
                return@setOnClickListener
            }
            if (tuoi.isEmpty()) {
                editTextOld.error = "title required"
                editTextOld.requestFocus()
                return@setOnClickListener
            }

            launch {

                context?.let {
                    val mHuyet = Huyet(maBenhNhan, tenBenhNhan, gioiTinh, tuoi, gioiTinh)
                    if (huyet == null) {
                        HuyetDataBase(it).getHuyetDao().addHuyet(mHuyet)
                        it.toast("Note Save")
                    } else {
                        mHuyet.id = huyet!!.id
                        HuyetDataBase(it).getHuyetDao().updateHuyet(mHuyet)
                        it.toast("Note Updated")
                    }
                    val action = PhacDoHuyetFragmentDirections.actionPhacDoHuyetFragmentToHomeFragment() //action chuyển tới màn nào
                    Navigation.findNavController(view).navigate(action)
                }
            }
        }
    }

    private fun setUpRecyclerView() {
        recyclerViewPhacDo.layoutManager = LinearLayoutManager(context)
        recyclerViewPhacDo.adapter = PhacDoHuyet(list)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
//            R.id.save_note -> if (note != null) deleteNote() else context?.toast("Cannot Delete")
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

class PhacDoHuyet(var list: java.util.ArrayList<String>) :
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
    }
}

class PhacDoViewHoloder(itemView: View) : RecyclerView.ViewHolder(itemView)