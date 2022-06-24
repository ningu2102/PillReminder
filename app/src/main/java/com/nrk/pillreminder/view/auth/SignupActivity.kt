package com.nrk.pillreminder.view.auth

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.nrk.pillreminder.R
import com.nrk.pillreminder.databinding.ActivitySignupBinding
import com.nrk.pillreminder.viewmodel.auth.LoginViewModel
import com.nrk.pillreminder.viewmodel.auth.SignupViewModel

class SignupActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignupBinding
    private val viewModel: SignupViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}