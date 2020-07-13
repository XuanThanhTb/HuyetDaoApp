package com.example.huytoapp.ui.ThongTinBenhNhan

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.huytoapp.HomeFragmentDirections
import com.example.huytoapp.R
import com.example.huytoapp.dp.thong_tin_benh_nhan.Huyet
import kotlinx.android.synthetic.main.cell_notes_apdapter.view.*

class NotesAdapter(private val huyetData: List<Huyet>) :
    RecyclerView.Adapter<NotesAdapter.NoteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        return NoteViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.cell_notes_apdapter, parent, false)
        )
    }

    override fun getItemCount() = huyetData.size

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.view.text_view_ma_benh_nhan.text = huyetData[position].maBN
        holder.view.text_view_ten_benh_nhan.text = huyetData[position].tenBN
        holder.view.text_view_tuoi_benh_nhan.text = huyetData[position].tuoi
        holder.view.text_view_gioi_tinh_benh_nhan.text = huyetData[position].gioiTinh

        holder.view.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToPhacDoHuyetFragment()
//            action. = huyetData[position]
            Navigation.findNavController(it).navigate(action)
        }
    }

    class NoteViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}