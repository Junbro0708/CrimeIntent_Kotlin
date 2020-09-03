package com.example.crimeintent

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager

abstract class SingleFragementActivity: FragmentActivity() {
    protected abstract fun createFragement(): Fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragement)

        val fm: FragmentManager = supportFragmentManager
        var fragment: Fragment? = fm.findFragmentById(R.id.frag_l)
        if (fragment == null) {
            fragment = createFragement()
            fm.beginTransaction().add(R.id.frag_l, fragment).commit()
        }
    }
}







