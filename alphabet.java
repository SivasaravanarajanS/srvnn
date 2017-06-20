import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class Sample 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
         System.out.println("ENTER THE CHARACTER");
          char character=s.next().charAt(0);  
          if((character>='a'&&character<='z')||(character>='A'&&character<='Z'))
                System.out.println("ENTERED CHARACTER IS ALPHABET");
          else 
               System.out.println("ENTERED CHARACTER IS NUMBER");
    }
        
}
    

