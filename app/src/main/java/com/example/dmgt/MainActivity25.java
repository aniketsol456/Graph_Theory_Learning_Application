package com.example.dmgt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity25 extends AppCompatActivity {

    public void clk1(View view){
        Intent intent = new Intent(this,MainActivity26.class);
        startActivity(intent);
    }
    public void clk2(View view){
        Intent intent = new Intent(this,MainActivity27.class);
        startActivity(intent);
    }
    public void clk3(View view){
        Intent intent = new Intent(this,MainActivity28.class);
        startActivity(intent);
    }
    public void clk4(View view){
        Intent intent = new Intent(this,MainActivity29.class);
        startActivity(intent);
    }
    public void clk5(View view){
        Intent intent = new Intent(this,MainActivity30.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main25);
    }
}