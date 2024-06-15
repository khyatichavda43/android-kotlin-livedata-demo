package com.example.livedatademo

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val myQuoteLiveData=MutableLiveData<String>("Well begun is half done")

    fun updateLiveData(){
        myQuoteLiveData.value="Another quote"
    }
}