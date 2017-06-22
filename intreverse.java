import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 class intreverse{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int n1 = 0;
while(n!=0)
{
n1=n1*10;
n1=n1+n%10;
n=n/10;
}
 
System.out.println(n1);
}
}
