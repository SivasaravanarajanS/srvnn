import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 class alphanumeric{
    public static void main(String[] args) 
    {
        int alphanumber=0;
        int number=0;
        int character=0;
      
        String str1="Welcome123 %%hi7 ()";
       for( int i=0;i<str1.length();i++ ) 
       {
        if((str1.charAt(i)>='a'&&str1.charAt(i)<='z')||(str1.charAt(i)>='A'&&str1.charAt(i)<='Z')||( str1.charAt(i) >= '0'&& str1.charAt(i) <= '9'))
         {
            alphanumber++;
           } 
          if(( str1.charAt(i) >= '0'&& str1.charAt(i) <= '9'))
          {
              number++;
          }
          if(str1.charAt(i)!=' ')
          { 
              character++;
          }
              
}
       System.out.print("Alphanumber in given string:");
       System.out.print(alphanumber);
       System.out.print("\nnumber in given string:");
        System.out.print(number);
        System.out.print("\ncharacter in given string:");
         System.out.print(character);
           
           
    }
    }

    

