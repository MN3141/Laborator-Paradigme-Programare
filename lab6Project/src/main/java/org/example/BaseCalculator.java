package org.example;

import java.util.ArrayList;

public class BaseCalculator {
    //ArrayList<Float> buffer;
    public BaseCalculator(){}
    public float add(float a,float b)
    {
        return a+b;
    }
    public float substract(float a,float b)
    {
        return a-b;
    }
    public float mul(float a,float b)
    {
        return a*b;
    }
    float div(float a,float b) // a/b
    {
        if(b==0) {
            System.out.println("Cannot divide by 0!");
            return -1000000;
        }
        else return a/b;
    }


}
