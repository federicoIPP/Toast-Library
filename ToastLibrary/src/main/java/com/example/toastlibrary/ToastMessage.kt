package com.example.toastlibrary

import android.content.Context
import android.widget.Toast

class ToastMessage {

    fun cobaToaster(context: Context, message: String )
    {
        Toast.makeText(context,message, Toast.LENGTH_LONG).show()
    }
}