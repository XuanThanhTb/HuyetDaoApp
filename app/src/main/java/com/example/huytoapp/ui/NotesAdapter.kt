package com.example.huytoapp.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.huytoapp.R
import com.example.huytoapp.dp.Huyet
import kotlinx.android.synthetic.main.cell_notes_apdapter.view.*
import kotlinx.android.synthetic.main.fragment_phac_do_huyet.view.*

class NotesAdapter(private val huyet: List<Huyet>) :
    RecyclerView.Adapter<NotesAdapter.NoteViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        return NoteViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.cell_notes_apdapter, parent, false)
        )
    }

    override fun getItemCount() = huyet.size

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        holder.view.textView2.text = huyet[position].maBN
    }

    class NoteViewHolder(val view: View) : RecyclerView.ViewHolder(view)
}