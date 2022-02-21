package com.jslee.designpatterns.ui.abstractFactory

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ThemeViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Theme Fragment"
    }
    val text: LiveData<String> = _text

    private var _eventBtn = MutableLiveData<Boolean>()
    val eventBtn: LiveData<Boolean>
        get() = _eventBtn

    fun onClickBtn(){
        _eventBtn.value = true
    }



}