package com.nrk.pillreminder.view.home

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.nrk.pillreminder.R
import com.nrk.pillreminder.databinding.ActivityHomeBinding
import com.nrk.pillreminder.viewmodel.auth.LoginViewModel
import com.nrk.pillreminder.viewmodel.home.HomeViewModel

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    private val viewModel: HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}