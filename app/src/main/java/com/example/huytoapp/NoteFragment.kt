package com.example.huytoapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.huytoapp.dp.thong_tin_benh_nhan.HuyetDataBase
import com.example.huytoapp.ui.ThongTinBenhNhan.BaseFragment
import com.example.huytoapp.ui.ThongTinBenhNhan.NotesAdapter
import kotlinx.android.synthetic.main.fragment_note.*
import kotlinx.coroutines.launch

class NoteFragment : BaseFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_note, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpRecyclerViewNote()
        launch {
            context?.let {
                var huyet = HuyetDataBase(
                    it
                ).getHuyetDao().getAllHuyets()
                recycler_view_notes.adapter =
                    NotesAdapter(huyet)
            }
        }
    }

    private fun setUpRecyclerViewNote() {
        recycler_view_notes.setHasFixedSize(true)
        recycler_view_notes.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
    }

}
