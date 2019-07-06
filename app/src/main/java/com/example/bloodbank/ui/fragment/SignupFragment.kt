package com.example.bloodbank.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import com.example.bloodbank.R
import com.example.bloodbank.ui.adapter.SpinnerAdapter
import com.example.bloodbank.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_sign_up.view.*

class SignupFragment: BaseFragment() {
    var list: ArrayList<String>?= null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_sign_up, container, false)
        initData()
        val adapter = SpinnerAdapter(context!!, list!!)
        rootView.Signup_Fragment_state_spinner.adapter = adapter
        rootView.Signup_Fragment_City_spinner.adapter = adapter
        rootView.Signup_Fragment_state_spinner.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(context, "${parent!!.getItemAtPosition(position)} Selected", Toast.LENGTH_SHORT).show()
            }

        }
        return rootView
    }
    private fun initData(){
        list = ArrayList()
        list!!.add("")
        list!!.add("القاهرة")
        list!!.add("الاسكندرية")
        list!!.add("طنطا")
        list!!.add("القليوبيه")

    }
}

