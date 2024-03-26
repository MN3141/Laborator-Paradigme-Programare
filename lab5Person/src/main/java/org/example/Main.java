package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//package person.*;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> fileBuffer = new ArrayList<String>();
        try {
            File fin = new File("src/input.txt");
            Scanner fileRead = new Scanner(fin);
            int i = 0;
            while (fileRead.hasNext()) {
                fileBuffer.add(fileRead.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
      int size=fileBuffer.size();
      for(int i=0;i<size;i++)
      {

      }
    }
}