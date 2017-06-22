
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 
class reverse{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int i;
 System.out.println("Enter The Word to Reverse:");
String new1=s.nextLine();
String new2="";
int length=new1.length();
 System.out.println(" The Reversed Word:");
for(i=length-1;i>=0;i--)
{
    new2=new2+new1.charAt(i);
}
     
System.out.println(new2);
}
}
