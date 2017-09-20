package com.example.aakash.versiona;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    String b;
    int number1, number2, number3, number4, number5;
    int number=11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void method3(int x, String y)
    {
        number1=1;
        number2=x;
        number3=3;
    }

    public void method4(String v)
    {

    }

    public int method5(){
        return 1;
    }

    public void method7()
    {
        number3=30;
    }

    public void method8()
    {
        number4=4;
        b="bb";
    }

    public void method9()
    {
        number5=5;
    }

    public void method10()
    {
        int number6;
        number6=6;
    }
    public void method11()
    {
        String s;
        s="hello";
    }
}
