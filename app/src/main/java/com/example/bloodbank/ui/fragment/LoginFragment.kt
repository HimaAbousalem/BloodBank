package com.example.bloodbank.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bloodbank.R

class LoginFragment : Fragment() {

    //private LoginViewModel mViewModel;

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.login_fragment, container, false)
        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        // mViewModel = ViewModelProviders.of(this).get(LoginViewModel.class);
        // TODO: Use the ViewModel
    }

}
