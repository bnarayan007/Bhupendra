import java.util.regex.*;
class string17
{
	public static void main(String[] args)
	{
	
	Pattern p=Pattern.compile("\\D*");
	Matcher m=p.matcher("abc");
	while(m.find())

	System.out.println(m.start());
	}
	
}