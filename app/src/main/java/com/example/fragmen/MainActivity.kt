package com.example.fragmen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pplg = findViewById<Button>(R.id.fragmentpplg)
        val to = findViewById<Button>(R.id.fragmentTO)
        val kuliner = findViewById<Button>(R.id.fragmentkuliner)
        val busana = findViewById<Button>(R.id.fragmentbusana)
        val tpfl = findViewById<Button>(R.id.fragmenttpfl)

        pplg.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer , pplgfragment())
            fragmentTransaction.commit()
        }
        to.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, tofragment())
            fragmentTransaction.commit()
        }
        kuliner.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, kulinerfragment())
            fragmentTransaction.commit()
        }
        busana.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, busanafragment())
            fragmentTransaction.commit()
        }
        tpfl.setOnClickListener {
            val fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragmentcontainer, tpflfragment())
            fragmentTransaction.commit()
        }
    }
}