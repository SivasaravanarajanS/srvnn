
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 class sumnaturals {
   public static void main(String[] args) 
    {int n;
        int i=1,sum=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number :");
        n=s.nextInt();
        do
            {
                 sum=sum+i;
                 i +=1;
            }   while(i<=n);
                 System.out.print(sum);
         }
       }
