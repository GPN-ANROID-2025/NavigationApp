package com.example.navigationapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    Button btnFinish;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        btnFinish = findViewById(R.id.btnFinish);
        btnFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();
            }
        });
        Log.d("mytag","ThirdActivity=>onStart()");
    }

        @Override
        protected void onStart() {
            super.onStart();
            Log.d("mytag","ThirdActivity=>onStart()");
        }

        @Override
        protected void onResume() {
            super.onResume();
            Log.d("mytag","ThirdActivity=>onResume()");
        }

        @Override
        protected void onPause() {
            super.onPause();
            Log.d("mytag","ThirdActivity=>onPause()");
        }

        @Override
        protected void onStop() {
            super.onStop();
            Log.d("mytag","ThirdActivity=>onStop()");
        }

        @Override
        protected void onRestart() {
            super.onRestart();
            Log.d("mytag","ThirdActivity=>onRestart()");
        }

        @Override
        protected void onDestroy() {
            super.onDestroy();
            Log.d("mytag","ThirdActivity=>onDestroy()");
        }
}
