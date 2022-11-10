package com.example.mysecondfragmentproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class HostActivity : AppCompatActivity() , ThirdFragment.Communicator {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_host)
    }

    override fun sendValue(name: String, message: String) {

        var fragment = supportFragmentManager.findFragmentById(R.id.fourth_fragment)

        if (fragment is FourthFragment){

            fragment.updateResult(name, message)
        }



    }
}