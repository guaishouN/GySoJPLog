package com.example.jitpacktestapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.guaishou.gysologlib.GuaishouLog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GuaishouLog.setTag("mainmain");
        GuaishouLog.print("mainmain");
    }
}
