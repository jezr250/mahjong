package com.example.mahjong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Score2110Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_2110);
    }

    public void goToFuCalc2Activity(View view) {
        Intent intent = new Intent(this, FuCalc2Activity.class);
        startActivity(intent);
    }
}