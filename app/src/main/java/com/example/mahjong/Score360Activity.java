package com.example.mahjong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Score360Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_360);
    }

    public void goToFuCalc3Activity(View view) {
        Intent intent = new Intent(this, FuCalc3Activity.class);
        startActivity(intent);
    }
}
