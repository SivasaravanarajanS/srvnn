import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

class digitinno{

   
    public static void main(String[] args) 
    {
        int n,i;
       int count=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number :");
        n=s.nextInt();
       i=n;
       do
         {
           i = i / 10;
           count++;
         } while (i > 0);
      System.out.print(count);
    }
    }

    

