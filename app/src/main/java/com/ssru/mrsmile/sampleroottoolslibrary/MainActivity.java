package com.ssru.mrsmile.sampleroottoolslibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.stericson.RootTools.RootTools;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RootTools.debugMode = true;

        /*
        Log Level

        1 = log.v

        2 = log.e

        3 = log.d
        */

        //Checking Root Device for su only
        if (RootTools.isRootAvailable()) {
            RootTools.log(TAG, "Is Device Root", 3, null);
        } else {
            RootTools.log(TAG, "Is Device Not Root", 3, null);
        }

        //it also calls su for your app,
        // requests permission,
        // and returns true if your app was successfully granted root permissions.
        if (RootTools.isAccessGiven()) {
            RootTools.log(TAG, "Is Device Root", 3, null);
        } else {
            RootTools.log(TAG, "Is Device Not Root", 3, null);
        }
    }
}
