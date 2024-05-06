package com.example.dmgt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity33 extends AppCompatActivity {


    public void clk1(View view){
        Intent intent = new Intent(this,MainActivity34.class);
        startActivity(intent);
    }
    public void clk2(View view){
        Intent intent = new Intent(this,MainActivity35.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main33);
    }
}