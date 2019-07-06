package com.example.bloodbank.ui.adapter

import android.content.Context
import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.bloodbank.R
import kotlinx.android.synthetic.main.spinner_row.view.*

class SpinnerAdapter (context: Context, list:ArrayList<String>): ArrayAdapter<String>(context, 0, list) {

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return initView(position, convertView, parent)
    }

    private fun initView(position: Int, convertView: View?, parent: ViewGroup): View{
        val view: View = convertView ?: LayoutInflater.from(context).inflate(R.layout.spinner_row, parent, false)
        val data = getItem(position)
        if(data!=null){
            view.Spinner_Text.text = data
        }
        return view
    }
}