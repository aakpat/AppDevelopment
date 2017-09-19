package com.example.aakash.versiona;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String a;
    int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void method1()
    {
        /*comment*/
    }

    public void method2()
    {
        /*comment*/
    }

    public void method3(String x, String y)
    {
        a = "Random";
    }

    public void method4(){
        number=10;
    }

}
