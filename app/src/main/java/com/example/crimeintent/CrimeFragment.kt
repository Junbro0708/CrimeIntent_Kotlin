package com.example.crimeintent

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment


class CrimeFragment : Fragment (){
    private lateinit var mCrime: Crime
    private lateinit var mTitleField: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mCrime = Crime()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v : View = inflater.inflate(R.layout.fragement_crime, container, false)

        mTitleField = v.findViewById(R.id.crime_frag)
        mTitleField.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(
                s: CharSequence,
                start: Int,
                count: Int,
                after: Int
            ) {
            }

            override fun onTextChanged(
                s: CharSequence,
                start: Int,
                before: Int,
                count: Int
            ) {
                mCrime.setTitle(s.toString())
            }

            override fun afterTextChanged(s: Editable) {}
        })

        return v
    }


}
