package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        HashMap<String,Integer> wordList=new HashMap<String, Integer>();
        ArrayList<String>fileBuffer=new ArrayList<>();
        try{
            File fin=new File("input.txt");
            Scanner fileRead=new Scanner(fin);
            int i=0;
            while (fileRead.hasNext())
            {
                fileBuffer.add(fileRead.next());
            }

        }

        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        int size=fileBuffer.size();
        for(int i=0;i<size;i++)
        {
            String temp=fileBuffer.get(i);
           if(wordList.containsKey(temp))
           {
               int counter=wordList.get(temp);
               counter++;
               wordList.replace(temp,counter);
           }
           else wordList.replace(temp,1);
        }
        String temp=wordList.toString();
        System.out.println(temp);
    }
}