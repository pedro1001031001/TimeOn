package com.example.timeon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        variablesYConstantes()
    }

    private fun variablesYConstantes(){

        /*
         *
         */
        var myFirstVariable = "Hello, tinny"

        println(myFirstVariable)

    }
}