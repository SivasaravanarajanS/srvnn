package posorneg;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class posorneg
{
public static void main(String[] args) 
    {
Scanner s=new Scanner(System.in);
System.out.println("ENTER THE VALUE");
        int number=s.nextInt();
        if(number>0)
            System.out.println("ENTERED VALUE IS POSITIVE");
        else if(number<0)
           System.out.println("ENTERED VALUE IS NEGATIVE");
        else
            System.out.println("ENTERED VALUE IS ZERO");
}
}
