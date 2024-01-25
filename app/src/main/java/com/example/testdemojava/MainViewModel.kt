package com.example.testdemojava

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
   private val factsLiveDataChange = MutableLiveData<String>("This is fact")

    val factsLiveData:LiveData<String>
        get() = factsLiveDataChange


    fun updateLiveData(){
        factsLiveDataChange.value= "Another fact"
    }
}