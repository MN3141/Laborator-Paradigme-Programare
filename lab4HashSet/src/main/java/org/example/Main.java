package org.example;
import java.lang.reflect.Array;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args)
    {
        boolean exists=false;
        ArrayList<String> fileBuffer=new ArrayList<String>();
        try{
            File fin=new File("input.txt");
            Scanner fileRead=new Scanner(fin);
            int i=0;
            while (fileRead.hasNext())
            {
                fileBuffer.add(fileRead.nextLine());
                System.out.println(fileBuffer.get(i));
                i++;
            }

        }
        catch (FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        Collections.sort(fileBuffer);
        String temp[]=new String[fileBuffer.size()];
        temp=fileBuffer.toArray(temp);
        for(int i=0;i<temp.length;i++)
            System.out.println(temp[i]);
        for(int i=0;i<temp.length && exists==false;i++)//consideram strict secventa "MERE" !
        {
            String temp2[]=temp[i].split(" ");
            for(int j=0;j<temp2.length && exists==false;j++)
            {
                if(temp2[j].equals("MERE"))
                    exists=true;
            }
        }
        System.out.println(exists);
    }

}