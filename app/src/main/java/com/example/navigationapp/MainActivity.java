package com.example.navigationapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageButton btnNext;
    EditText etNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("mytag","MainActivity=>onCreate()");
        btnNext=findViewById(R.id.btnNext);
        etNumber=findViewById(R.id.etNumber);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle=new Bundle();
                bundle.putString("name","Sachin");
                Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("number",Integer.parseInt(etNumber.getText().toString()));
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("mytag","MainActivity=>onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("mytag","MainActivity=>onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("mytag","MainActivity=>onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("mytag","MainActivity=>onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("mytag","MainActivity=>onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("mytag","MainActivity=>onDestroy()");
    }
}