package com.example.huytoapp

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.cell_phac_do_huyet.view.*
import kotlinx.android.synthetic.main.fragment_phac_do_huyet.*

class PhacDoHuyetFragment : Fragment() {
    var dataHuyetDao: String? = null

    val list: ArrayList<String> = ArrayList()
    private val PREFERENCE_FILE_KEY = "myAppPreference"
    private val KEY = "KEY"
    lateinit var sharedPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            dataHuyetDao = it?.getString("phacdo")
            list.add(dataHuyetDao.toString())
        }
//        val context: Context? = activity
//        sharedPref = requireActivity().getSharedPreferences(
//            PREFERENCE_FILE_KEY, Context.MODE_PRIVATE)
//        loadData()
    }

    fun loadData(){
        val text:String? = sharedPref.getString(KEY, "")
        editTextPersonCode.setText(text)
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
//        var editer = sharedPref.edit()
//        editer.putString(KEY, editTextPersonCode.text.toString())
    }

    private fun setUpRecyclerView() {
        recyclerViewPhacDo.layoutManager = LinearLayoutManager(context)
        recyclerViewPhacDo.adapter = PhacDoHuyet(list)
    }

    companion object {

        @JvmStatic
        fun newInstance() = PhacDoHuyetFragment()
    }
}

class PhacDoHuyet(var list: java.util.ArrayList<String>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.cell_phac_do_huyet, parent, false)
        var viewHolder = PhacDoViewHoloder(itemView)
        return viewHolder
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is PhacDoViewHoloder){
            holder.itemView.textHuyetDao.text = list[position]
            holder.itemView.textIndexHuyet.text = "${position + 1}"+"."
        }
    }
}

class PhacDoViewHoloder(itemView: View) : RecyclerView.ViewHolder(itemView)