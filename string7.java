import java.util.Scanner;
public class string7
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("enter your string");
		String text=in.nextLine();
		char[] process=text.toCharArray();
		boolean status=false;
		int index=0;
		for(int i=0;i<process.length;i++)
		{
			for(int j=i+1;j<process.length;j++)
			{
				if(process[i]==process[j])
				{
					status=false;
					break;
				}
				else
				{
				status=true;
				index=i;
				}
			}
			if(status)
			{
			System.out.println("first non-repeated array is:"+process[index]+" index :"+ index);
			break;
			}
   
}  		}
}