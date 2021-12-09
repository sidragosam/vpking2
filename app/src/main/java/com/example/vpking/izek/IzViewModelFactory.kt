package com.example.vpking.izek

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class IzViewModelFactory() : ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(IzViewModel::class.java)) {
            return IzViewModel() as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}