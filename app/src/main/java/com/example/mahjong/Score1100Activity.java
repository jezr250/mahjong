package com.example.mahjong;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Score1100Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_1100);
    }

    public void goToFuCalcActivity(View view) {
        Intent intent = new Intent(this, FuCalcActivity.class);
        startActivity(intent);
    }
}