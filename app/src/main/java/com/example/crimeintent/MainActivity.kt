package com.example.crimeintent

//import androidx.appcompat.app.AppCompatActivity


import androidx.fragment.app.Fragment


class MainActivity : SingleFragementActivity() {
    override fun createFragement(): Fragment {
        return CrimeFragment()
    }
}
