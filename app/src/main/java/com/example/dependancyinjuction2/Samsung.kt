package com.example.dependancyinjuction2

import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class Samsung @Inject constructor(){
    init {
        Log.i("MYTAG","Samsung initalized...!")
    }
    fun getSamsung(){
        Log.i("MYTAG","Samsung working...!")
    }
}