import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 class prime {
   public static void main(String[] args) {

       int i =0,n;
       String  primeno = "";
       for (i = 1; i <= 10; i++)         
       { 		  	  
          int counter=0; 	  
          for(n =i; n>=1; n--)
	  {
             if(i%n==0)
	     {
 		counter = counter + 1;
             }
	  }
	  if (counter ==2)
	  {
     primeno = primeno+i+"\n";             
	  }	
       }	
       System.out.println("Prime numbers from 1 to 10:");
       System.out.println(primeno);
  }
 }
