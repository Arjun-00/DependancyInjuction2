package com.example.dependancyinjuction2
import android.app.Application
class SmartPhoneApplication : Application(){

    // for global initialization at app opening time
lateinit var smartPhoneComponent: SmartPhoneComponent
    override fun onCreate() {
        smartPhoneComponent = initDagger()
        super.onCreate()
    }

    private fun initDagger() : SmartPhoneComponent =
        DaggerSmartPhoneComponent.builder().iphoneModule(IphoneModule(10000))
            .build()
}