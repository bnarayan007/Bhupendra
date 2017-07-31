import java.lang.String;
import java.util.Scanner;
import java.util.*;
class string12
{
	public static void main(String[] args)
	{
		Scanner sx=new Scanner(System.in);
		System.out.println("enter your string");
		String s=sx.nextLine();
		s=myreverse(s);
		System.out.println(s);
	}
	public static String myreverse(String s)
	{
		StringBuffer sb=new StringBuffer();
		for(int i=s.length()-1;i>=0;i--)
		{
			sb.append(s.charAt(i));
		}
	return sb.toString();
	} 
}

		