import java.io.*;
import java.util.*;
import java.lang.String;
public class string9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your string");
		String text=sc.nextLine();
		char[] process=text.toCharArray();
		for(int i=0;i<(process.length-1);i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(process[j]<process[j-1])
				{
				char temp=process[j-1];
				process[j-1]=process[j];
				process[j]=temp;
				}
			}
		}
		text=String.valueOf(process);
		System.out.println(text);
	}
}
	