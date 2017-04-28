package com.example.shaloin.thirteenthassignmentc;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button start,stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=(Button)findViewById(R.id.startButton);
        stop=(Button)findViewById(R.id.stopButton);
        start.setOnClickListener(this);
        stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.startButton:
                startService(new Intent(this,MyService.class));
                break;
            case R.id.stopButton:
                stopService(new Intent(this,MyService.class));
                break;
        }

    }
}
