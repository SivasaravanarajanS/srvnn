
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class evendisplay
{
public static void main (String[] args)
{
Scanner s=new Scanner(System.in);
      
        int n=s.nextInt(); 
               
                for(int i=0; i <= n; i++){
                       
                          if( i % 2 == 0){
                                System.out.print(i + " ");
              }
          }
     }
  }