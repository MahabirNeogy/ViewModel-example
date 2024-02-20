package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        viewModel= ViewModelProvider(this).get(MainViewModel::class.java)
        setContentView(binding.root)

        settext()

        binding.button.setOnClickListener {
            viewModel.increment()
            settext()
        }
    }



    private fun settext() {
        binding.textView.text=viewModel.count.toString()
    }
}