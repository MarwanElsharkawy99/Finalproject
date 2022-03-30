package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Goto(View view) {
        Intent i =new Intent(this,MainActivity2.class);
        startActivity(i);
    }

    public void torem(View view) {
        Intent i =new Intent(this,MainActivity4.class);
        startActivity(i);
    }

    public void topro(View view) {
        Intent i =new Intent(this,MainActivity5.class);
        startActivity(i);
    }


    public void todes(View view) {

            Intent i =new Intent(this,MainActivity3.class);
            startActivity(i);

    }

    public void tolog(View view) {
        Intent i =new Intent(this,MainActivity6.class);
        startActivity(i);
    }

    public void tocat(View view) {
        Intent i =new Intent(this,MainActivity7.class);
        startActivity(i);
    }
}