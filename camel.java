
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
 class camel {
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		int flag=0;
		String result="";
		result=result+Character.toUpperCase(s1.charAt(0));
		for(int i=2;i<=s1.length();i++){
			flag=0;
			if(s1.charAt(i-1)==' '){
				flag=1;
			}
			if(flag==1){
				result=result+Character.toUpperCase(s1.charAt(i));
                                i++;
			}
			else{
				result=result+s1.charAt(i-1);
			}
		}
System.out.println("\t" +result);
}
}
