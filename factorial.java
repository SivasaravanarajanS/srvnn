import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 
class factorial{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
int fact =1;
int i;
int n=s.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
 
System.out.println(fact);
}
}
