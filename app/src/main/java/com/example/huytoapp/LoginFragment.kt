package com.example.huytoapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment() {

    val listPasswork: ArrayList<String> = arrayListOf<String>("1","123123", "123456", "1234567")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.title = ""
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonLogin.setOnClickListener {
            var passwork = passEditText.text.toString()
            var isCheckLogin:Boolean = false
            if(isCheckLogin == false){
                for (item in 0..2){
                    if (passwork == listPasswork[item]){
                        passEditText.setText("")
                        listPasswork.removeAt(item)
                        isCheckLogin = true
                        var bundle = Bundle().apply {
                            putBoolean("check", isCheckLogin)
                        }
                        Navigation.findNavController(it).navigate(R.id.homeFragment, bundle)
                        Log.d("chieuhv","bundle :"+bundle)
                        return@setOnClickListener
                    }else{
                        Toast.makeText(activity, "Mat khau dang nhap sai roi", Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }
                }
            }else{
                Toast.makeText(activity, "Mat khau nay da duoc dang nhap roi", Toast.LENGTH_SHORT).show()
            }
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = LoginFragment()
    }
}
