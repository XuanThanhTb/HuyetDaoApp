package com.example.huytoapp.ui.ButtonHuyet

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.huytoapp.MainActivity
import com.example.huytoapp.R
import com.example.huytoapp.dp.ButtonHuyet.ButtonHuyet
import kotlinx.android.synthetic.main.cell_phac_do_huyet.view.*

class ButtonHuyetAdapter(
    private val listButtonHuyetAdapter: List<ButtonHuyet>,
    val activity: MainActivity
) :
    RecyclerView.Adapter<ButtonHuyetAdapter.ButtonHuyetHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ButtonHuyetHolder {
        return ButtonHuyetHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.cell_phac_do_huyet, parent, false)
        )
    }

    override fun getItemCount() = listButtonHuyetAdapter.size

    override fun onBindViewHolder(holder: ButtonHuyetHolder, position: Int) {
        holder.view.textHuyetDao.text = listButtonHuyetAdapter[position].tenHuyet ?: "Chưa có dữ liệu"
        holder.itemView.setOnLongClickListener {
            Toast.makeText(activity, "action", Toast.LENGTH_LONG).show()
            true
        }
    }

    class ButtonHuyetHolder(val view: View) : RecyclerView.ViewHolder(view)
}