package com.example.lukac.FragmentExample1;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends FragmentActivity {



    private static final String TAG = "MAIN";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        Thread t = new Thread() {
            public void run() {
                try {
                    sleep(5000);

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Log.d(TAG, "second thread");
                }
            }
        };
        t.start();

        // attivo il Fragment Manager
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        // recupero o ricerco il Fragment, se esiste, dalla lista dei Fragment di Fragment Manager
        Fragment fragment = fm.findFragmentById(R.id.fragment_container_1);
        // altrimenti lo creo da zero e lo innesto
        if(fragment == null) {
            fragment = new CrimeFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container_1, fragment)
                    // commit -> invia nel thread di UI le modifiche
                    .commit();
        }


    }
}
