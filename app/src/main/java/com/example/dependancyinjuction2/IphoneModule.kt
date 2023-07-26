package com.example.dependancyinjuction2
import android.util.Log
import dagger.Module
import dagger.Provides

@Module
class IphoneModule (val iphonePrice : Int) {
    @Provides
    fun getIphoneModule() : Iphone{
        Log.i("MYTAG","Iphone price is $iphonePrice")
        return Iphone()
    }
}