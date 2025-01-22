package com.example.navigationapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    Button btnNext1;
    TextView tvNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("mytag","SecondActivity=>onCreate()");
        btnNext1=findViewById(R.id.btnNext1);
        tvNumber=findViewById(R.id.tvNumber);

        int number=getIntent().getIntExtra("number",0);
        tvNumber.setText(String.valueOf(number));
        Bundle bundle=getIntent().getExtras();

        Log.d("mytag",bundle.getString("name"));
        btnNext1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SecondActivity.this, ThirdActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("mytag","SecondActivity=>onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("mytag","SecondActivity=>onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("mytag","SecondActivity=>onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("mytag","SecondActivity=>onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("mytag","SecondActivity=>onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("mytag","SecondActivity=>onDestroy()");
    }
}