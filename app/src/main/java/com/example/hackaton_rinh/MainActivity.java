package com.example.hackaton_rinh;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private RelativeLayout MainRel;
    private RelativeLayout SecondRel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
         MainRel = (RelativeLayout) findViewById(R.id.MainRelative);
         SecondRel = (RelativeLayout) findViewById(R.id.AnotherRelative);
        textView = findViewById(R.id.halloworld);
        textView.setText("AbobaHallo");
        int x = 876;
        int y = 666;
        int r = 777;
    }
    public void DoIt(View view){
        MainRel.setVisibility(View.GONE);
        SecondRel.setVisibility(View.VISIBLE);
    }
}

