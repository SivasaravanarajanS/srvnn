
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Nforloop {
public static void main(String[] args) 
    {
int n,i;
        int sum=0;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Number :");
        n=s.nextInt();
       for(i=1;i<=n;i++)
            {
                 sum=sum+i;
             
            }
       System.out.print(sum);
   }
}
