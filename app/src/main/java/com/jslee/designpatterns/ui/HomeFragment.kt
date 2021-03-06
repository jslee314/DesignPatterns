package com.jslee.designpatterns.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.jslee.designpatterns.databinding.FragmentHomeBinding

class HomeFragment : Fragment(){

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        binding = FragmentHomeBinding.inflate(inflater)

        setUpBinding()
        setUpObserver()

        return  binding.root
    }
    private fun setUpBinding(){
        binding.lifecycleOwner = this
        //binding.viewModel = viewModel
    }

    private fun setUpObserver(){
        homeViewModel.text.observe(viewLifecycleOwner, Observer {
            binding.textHome.text = it
        })

    }
}