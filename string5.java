import java.lang.String;
import java.io.*;
import java.util.*;

public class string5
{
	public static void main(String[] args)
	{
	String text;
	Scanner ab=new Scanner(System.in);
	text=ab.readLine();
	int count=0;
	for(int i=0;i<text.length();i++)
	{
		char c=text.charAt(i);
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{ 
			count++;
		}
	}
	System.out.println(count);
	}
}
		