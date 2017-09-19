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

    public void method1()
    {
        /*comment*/
    }

    public void method3(String x, String y)
    {
        a = "Changed";
    }

    public void method5(){
        number1=10;
    }

    public void method6()
    {
    }
}
