
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class palindrome {
    
 
       public static void main(String[] args)  {
 
        int number, remember, number1, reverse=0;
        Scanner scan = new Scanner(System.in);
	System.out.print("Enter a Number : ");
        number = scan.nextInt();
		
       number1 = number;
		
        while(number != 0)
        {
            remember = number%10;
            reverse = reverse*10 + remember;
            number = number/10;
        }
        if(reverse==number1)
        {
            System.out.print("This is a Palindrome Number");
        }
        else
        {
            System.out.print("This is not a Palindrome Number");
        }
}
	}
  

