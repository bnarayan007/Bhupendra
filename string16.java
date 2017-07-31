import java.lang.String;
import java.util.Scanner;

class string16
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your string");
		String s1=sc.nextLine();
		s1=mywordreverse(s1);
		System.out.println(s1);
		
	}
	public static String mywordreverse(String s1)
	{      
		String s2="";
		
		for(String w:s1.split("\\s"))
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			s2+=sb.toString()+" ";	
		}
		return s2.trim();
	}
}