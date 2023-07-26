package com.example.dependancyinjuction2

import dagger.Component

@Component(modules = [IphoneModule::class])
interface SmartPhoneComponent {
   // fun getSmartPhoneComponent() : SmartPhone

    fun inject(mainActivity: MainActivity)

}