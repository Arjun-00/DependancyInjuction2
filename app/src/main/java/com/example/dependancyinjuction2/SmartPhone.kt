package com.example.dependancyinjuction2
import android.util.Log
import javax.inject.Inject
import javax.inject.Singleton
//for singleton
@Singleton
class SmartPhone @Inject constructor(val samsung:Samsung,val iphone: Iphone) {
    init {
        Log.i("MYTAG","smartphone initalized...!")
    }
    fun getSmartPhone(){
        Log.i("MYTAG","smartphone working...!")
        samsung.getSamsung()
        iphone.getIphone()
    }
}