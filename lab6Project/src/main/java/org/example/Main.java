package org.example;
public class Main {
    public static void main(String[] args) {
       AdvancedCalculator ti=new AdvancedCalculator(0);
       ti.add(100);
       ti.sqrt();
       System.out.println(ti.getValue());
    }
}