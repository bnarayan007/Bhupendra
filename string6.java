import java.lang.String;
import java.io.*;
import java.util.*;

class string6{
    public static void main(String args[]) {
	String text;
        Scanner sc=new Scanner(System.in);
	System.out.println("Input a string");
	text=sc.nextLine();
	for(int i=0,j=text.length()-1;i<=j;i++,j--)
	{
		if(text.charAt(i)!=text.charAt(j))
	        {
			System.out.println("not pallindrome");
		return;
		}
	}
	
   	 
	System.out.println("pallindrome");
}
}
					