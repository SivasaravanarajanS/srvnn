import java.lang.*;
import java.io.*;
import java.util.Scanner;
class primeornot
{
	public static void main (String[] args){int number=0;
int prime=0;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
number=s.nextInt();
if(number%2==0 && number>=2)
{
prime=0;

}
else
{
prime=1;
}
if(prime==0)
{
System.out.println(" not prime number");
}
else
{
    System.out.println("  prime number");
}
}
	}
