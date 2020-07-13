package com.example.huytoapp.ui.ThongTinBenhNhan

import android.content.Context
import android.view.Gravity
import android.widget.Toast

fun Context.toast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}