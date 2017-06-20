import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

 class largest {

    
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
      System.out.println("Enter The Three Numbers");
      int a=s.nextInt();
      int b=s.nextInt();
      int c=s.nextInt();
      if(a>b&&a>c)
          System.out.println("A VALUE IS GREATER");
      else if(b>c)
          System.out.println("B VALUE IS GREATER");
    else
          System.out.println("c VALUE IS GREATER");
    }
        
    }
    

