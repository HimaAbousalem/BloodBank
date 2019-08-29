package com.example.bloodbank.ui.fragment

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.View.VISIBLE
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import com.example.bloodbank.R
import com.example.bloodbank.callback.ISwitchFragments
import com.example.bloodbank.data.model.request.LoginRequest
import com.example.bloodbank.data.model.response.*
import com.example.bloodbank.data.repository.UserRepository
import com.example.bloodbank.data.repository.UserRepository_Factory
import com.example.bloodbank.extentions.hideKeyboard
import com.example.bloodbank.ui.activity.AuthenticationActivity
import com.example.bloodbank.ui.activity.MainActivity
import com.example.bloodbank.ui.activity.TAG
import com.example.bloodbank.ui.base.BaseFragment
import com.example.bloodbank.ui.base.ViewModelProvidersFactory
import com.example.bloodbank.ui.viewmodel.LoginViewModel
import com.example.bloodbank.utils.FORGET_PASSWORD_FRAGMENT
import com.example.bloodbank.utils.SIGNUP_FRAGMENT
import io.reactivex.Observable
import io.reactivex.Observer
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.view.*
import kotlinx.android.synthetic.main.fragment_login.view.Login_Fragment_ProgressBar
import timber.log.Timber
import java.lang.Error
import java.lang.RuntimeException
import java.util.*
import javax.inject.Inject

class LoginFragment : BaseFragment() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvidersFactory
    private lateinit var loginViewModel: LoginViewModel
    private val disposable: CompositeDisposable? = CompositeDisposable()
    private var listener: ISwitchFragments?=null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.fragment_login, container, false)
        getActivityComponent().inject(this)
        loginViewModel = ViewModelProviders.of(this, viewModelFactory)[LoginViewModel::class.java]
        return rootView
    }

    override fun onStart() {
        super.onStart()
        Login_Fragment_Login_Btn.setOnClickListener {
            validateInputAndSignIn()
        }
        Login_Fragment_SignUp_Btn.setOnClickListener { listener!!.switchFragment(SIGNUP_FRAGMENT) }
        Login_Fragment_Forget_Password_Text_View.setOnClickListener { listener!!.switchFragment(FORGET_PASSWORD_FRAGMENT) }
    }

    @SuppressLint("CheckResult")
    private fun validateInputAndSignIn() {
        val phoneNumber = Login_Fragment_Phone_Edit_Text.text.toString().trim()
        val password = Login_Fragment_Password_Edit_Text.text.toString().trim()
        //Toast.makeText(activity, "Login Button clicked!", Toast.LENGTH_SHORT).show()
        hideKeyboard()
        if(phoneNumber.isEmpty()||password.isEmpty())return

        val loginRequest = LoginRequest(phoneNumber, password)
        //first we need to make request to api using this LoginRequest.
        // this code belongs to ViewModel Class.
        disposable?.add(loginViewModel.signInUser(loginRequest)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({
                    when(it){
                        is LoadingState ->{
                            if(it.loading) {
                                Timber.d("I'm Loading State")
                                Login_Fragment_ProgressBar.visibility = VISIBLE
                            }else {
                                Timber.d("I'm done Loading")
                                Login_Fragment_ProgressBar.visibility = GONE
                            }
                        }
                        is ErrorState ->{
                            Timber.d("I'm Error State: ${it.message}")
                        }
                        is Success -> {
                            if(it.data?.status==1) {
                                Timber.d("DATA MSG = ${it.data?.msg}")
                                startActivity(Intent(activity, MainActivity::class.java))
                            }else {
                                Timber.d("DATA MSG = ${it.data?.msg}")
                            }
                        }
                    }
                },{}))
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is ISwitchFragments){
            listener = context
        }else{
            throw RuntimeException(context.toString()+ "must implement ISwitchFragments")
        }
    }

    override fun onStop() {
        super.onStop()
        disposable?.clear()
    }
    override fun onDetach() {
        super.onDetach()
        listener = null
    }
}
