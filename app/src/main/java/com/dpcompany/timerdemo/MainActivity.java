package com.dpcompany.timerdemo;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Handler handler = new Handler();

        Runnable run = new Runnable() {
            @Override
            public void run() {
                //Insert code to be run every second
                Log.i("Runnable has run", "A second must have passed");
                handler.postDelayed(this, 1000);
            }
        };
        handler.post(run);
    }
}
