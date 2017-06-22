import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 class roman{
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter the Number");
int number=s.nextInt();

String[] thousands={"","M","MM","MMM"};
String[] hundreds={"","C","CC","CCC","D","DC","DCC","DCCC","CM"};
String[] tens={"","X","XX","XXX","XL","X","LX","LXX","LXXX","xC"};
String[] units={"","I","II","III","IV","V","VI","VII","VIII","IX","X"};
if(number>0&&number<4000)
{
int th=number/1000;
int h=(number/100)%10;
int t=(number/10)%10;
int u=number%10;
System.out.println("number to roman");
System.out.println(thousands[th]+hundreds[th]+tens[t]+units[u]);
}
else
    System.out.println("Not in a range");
    
