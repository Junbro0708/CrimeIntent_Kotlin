package com.example.crimeintent

import android.R
import android.app.Activity
import android.app.PendingIntent.getActivity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class CrimeListFragement: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view: View = inflater.inflate(R.layout.fragement_crime_list, container, false)
        var mCrimeRecyclerView: RecyclerView = view.findViewById(R.id.crime_recycler_view)
        mCrimeRecyclerView.layoutManager = LinearLayoutManager(activity)

        return view
    }

    private class CrimeHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        lateinit var mTitleView: TextView

        fun CrimeHolder(itemView: View) {
            super.itemView

            mTitleView = itemView as TextView
        }

    }

    private class CrimeAdapter() : RecyclerView.Adapter<CrimeHolder>() {
        private lateinit var mCrimes: List<Crime>
        fun CrimeAdapter(crimes: List<Crime>) { mCrimes = crimes }

        fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CrimeHolder? {
            val layoutInflater = LayoutInflater.from(getActivity())
            val view: View =
                layoutInflater.inflate(R.layout.simple_list_item_1, parent, false)
            return CrimeHolder(view)
        }

        override fun getItemCount(): Int {
            return mCrimes.size
        }

        override fun onBindViewHolder(holder: CrimeHolder, position: Int) {
            var crime: Crime = mCrimes[position]
            holder.mTitleView.setText(crime.getTitle())
        }

    }
}

