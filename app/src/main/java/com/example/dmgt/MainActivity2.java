package com.example.dmgt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    public void tap1(View view)
    {
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);
    }
    public void tap2(View view)
    {
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);
    }
    public void tap3(View view){
        Intent intent = new Intent(this,MainActivity25.class);
        startActivity(intent);
    }
    public void tap4(View view){
        Intent intent = new Intent(this,MainActivity33.class);
        startActivity(intent);
    }
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }
}