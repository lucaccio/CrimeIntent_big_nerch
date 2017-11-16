package com.example.lukac.FragmentExample1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukac on 15/11/2017.
 */

public  class CrimeLab {


    private List<Crime> mCrimes;

    // costruttore
    private CrimeLab() {
        // creo un array vuoto di Crimes
        mCrimes = new ArrayList<>();
        // creo una serie di crimes (cento)
        for(int i = 0; i<100; i++) {
            Crime crime = new Crime();
            crime.setTitle(String.format("Crime #%d", i));
            crime.setSolved(i % 2 == 0);
            mCrimes.add(crime);
        }
    }



}
