package com.example.aakash.versiona;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    final int a=0;
    private int p=0;
    String b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void method3(int x, String y)
    {
       b=y;
    }

    public void methoda(){ }

    private void methodb(){ }

    public void method4(String v)
    {
        System.out.println(p);
    }



}
