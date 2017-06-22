import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 class Sample1 {
   public static void main(String[] args) {
 Scanner s=new Scanner(System.in);
 
System.out.println("Enter the String");

String str=new String();
StringBuilder str1=new StringBuilder();
str=s.nextLine();
int i,j;
        char[] letter= str.toCharArray();
for(i=0;i<letter.length;i++)
{
    if(i%2==0)
    {
        if((i+1)<letter.length)
        {
            str1.append(letter[i+1]);
        }
        str1.append(letter[i]);
    }
  }
System.out.println(str1);

    }
}
