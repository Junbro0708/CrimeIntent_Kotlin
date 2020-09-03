package com.example.crimeintent

import androidx.fragment.app.Fragment

class CrimeListActivity (): SingleFragementActivity() {
    override fun createFragement(): Fragment {
        return CrimeListFragement()
    }
}