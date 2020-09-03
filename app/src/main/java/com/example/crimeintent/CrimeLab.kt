package com.example.crimeintent

import android.content.Context

class CrimeLab(context: Context) {
    private companion object var sCrimeLab = CrimeLab(context)

    private lateinit var mCrimes: List<Crime>

    fun get(context: Context) {
        if(sCrimeLab == null) {
            sCrimeLab = CrimeLab(context)
        }
        return sCrimeLab
    }

    private fun CrimeLab(context: Context) {
        mCrimes = ArrayList()
        for ( i in 0 until 5) {
            var crime = Crime()
            crime.setTitle("버킷리스트 #$i")
        }
    }
}