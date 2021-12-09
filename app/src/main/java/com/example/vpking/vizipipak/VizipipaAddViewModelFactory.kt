package com.example.vpking.vizipipak

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class VizipipaAddViewModelFactory() : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(VizipipaAddViewModel::class.java)) {
            return VizipipaAddViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}