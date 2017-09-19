package com.example.aakash.versiona;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String a;
    int number1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void method3(int x, String y)
    {

    }

    public int method5(){
        number1=10;
        return number1;
    }

    public String method6(String z)
    {
        a=z;
        return a;
    }
}
