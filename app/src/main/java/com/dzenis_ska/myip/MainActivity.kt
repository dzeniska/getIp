package com.dzenis_ska.myip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.core.view.isVisible
import com.dzenis_ska.myip.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        viewModel.launchApi.observe(this,{
            binding.textView.text = "IP: ${it}"
            binding.progressBar.isVisible = false
        })


        binding.button.setOnClickListener {
            binding.progressBar.isVisible = true
            binding.textView.text = "IP..."
            viewModel.getIp()
        }
    }
}