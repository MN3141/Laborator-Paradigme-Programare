package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList tab=new ArrayList();
        for(int i=0;i<=14;i++) {
            tab.add((int)(Math.random() * 10 + 1));
            System.out.println(tab.get(i));}
        System.out.println(tab);
    }

}