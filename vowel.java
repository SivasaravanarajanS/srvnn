import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
class vowel {

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);

System.out.println("ENTER THE CHARACTER");
      char character=s.next().charAt(0);  
        if(character=='a'||character=='e'||character=='i'||character=='o'||character=='u')
            System.out.println("ENTERED CHARACTER IS VOWEL");
                else
            if((character>='a'&&character<='z')||(character>='A'&&character<='Z'))
                System.out.println("ENTERED CHARACTER IS CONSTANT");
}
        
    }
    

