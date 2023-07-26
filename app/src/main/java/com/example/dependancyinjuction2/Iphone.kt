package com.example.dependancyinjuction2

import android.util.Log
import javax.inject.Singleton

@Singleton
class Iphone {
    init {
        Log.i("MYTAG","Iphone initalized...!")
    }
    fun getIphone(){
        Log.i("MYTAG","Iphone working...!")
    }
}