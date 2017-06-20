import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class leap {
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
      System.out.println("Enter The Numbers");
      int a=s.nextInt();
      if(a%4==0)
 
        System.out.println("Given Numbers is Leap Year");
      else
          System.out.println("Given Numbers is not Leap Year");
    }
}
