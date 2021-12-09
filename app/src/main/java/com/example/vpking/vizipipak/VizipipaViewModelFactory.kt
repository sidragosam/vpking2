package com.example.vpking.vizipipak

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class VizipipaViewModelFactory() : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(VizipipaViewModel::class.java)) {
            return VizipipaViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}