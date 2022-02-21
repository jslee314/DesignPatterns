package com.jslee.designpatterns.ui.abstractFactory

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.jslee.designpatterns.R
import com.jslee.designpatterns.databinding.FragmentThemeBinding

class ThemeFragment: Fragment() {
    private lateinit var themeViewModel: ThemeViewModel
    private lateinit var binding: FragmentThemeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        themeViewModel = ViewModelProvider(this).get(ThemeViewModel::class.java)

        binding = FragmentThemeBinding.inflate(inflater)

        setUpBinding()
        setUpObserver()

        return binding.root
    }
    private fun setUpBinding(){
        binding.lifecycleOwner = this
        //binding.viewModel = viewModel
    }

    private fun setUpObserver(){
        themeViewModel.text.observe(viewLifecycleOwner, Observer {
            binding.textTheme.text = it
        })

        themeViewModel.eventBtn



    }





}