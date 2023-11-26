package com.example.capstonedesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(StartActivity.this, Explain1Activity.class);
                startActivity(intent);
                finish(); // 현재 액티비티를 종료하여 뒤로가기 버튼을 눌렀을 때 다시 돌아오지 않도록 함
            }
        }, 2500);
    }
}