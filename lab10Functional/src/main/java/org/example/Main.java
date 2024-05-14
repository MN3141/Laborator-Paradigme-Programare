package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void task0(ArrayList<String> list)
    {
        List<String> output=list.stream().filter((input)->input.length()>=6).toList();
        System.out.println(output);
    }
    public static void task1(ArrayList<String> list)
    {
        List<Integer> output=list.stream().filter((input)->input.length()<=4).map((element)->element.length()).toList();
        System.out.println(output);
    }

    public static void task2(ArrayList<String> list)
    {
        String output=list.stream().reduce((x0,x1)->x0+x1).get();
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<String>();
        names.add("Alex");
        names.add("Ion");
        names.add("Vasile");
        names.add("Ioachim");
        names.add("Lia");
        task0(names);
        task1(names);
        task2(names);
    }
}