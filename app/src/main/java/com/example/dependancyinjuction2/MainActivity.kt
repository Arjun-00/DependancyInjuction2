package com.example.dependancyinjuction2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var smartPhone: SmartPhone
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

   //     DaggerSmartPhoneComponent.create().getSmartPhoneComponent().getSmartPhone()

//        DaggerSmartPhoneComponent.create().inject(this)
//        smartPhone.getSmartPhone()

        DaggerSmartPhoneComponent.builder().iphoneModule(IphoneModule(10000))
            .build().inject(this)

        // for global initialization at app opening time
        (application as SmartPhoneApplication).smartPhoneComponent
            .inject(this)// manifest ill android:name=".SmartPhoneComponent"

    }
}