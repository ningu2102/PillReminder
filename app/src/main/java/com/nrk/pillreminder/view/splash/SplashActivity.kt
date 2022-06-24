package com.nrk.pillreminder.view.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.coroutineScope
import com.nrk.pillreminder.R
import com.nrk.pillreminder.view.auth.LoginActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.SplashTheme)
        lifecycle.coroutineScope.launch{
            delay(3000)
        }
        startActivity(Intent(this, LoginActivity::class.java))
    }
}