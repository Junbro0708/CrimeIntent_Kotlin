package com.example.crimeintent

import java.util.*

class Crime {
    private  lateinit var mTitle: String
    private var mId: UUID = UUID.randomUUID()


    fun getId(): UUID {
        return mId
    }

    fun getTitle(): String {
        return mTitle
    }

    fun setTitle(title: String) {
        mTitle = title
    }
}