class string1
{
	public static void main(String[] args)
	{	String s="abcde";
		s=myreverse(s);
		
		System.out.println(s);
	}
	public static String myreverse(String s)
	{
		String srt=" ";
		for(int i=s.length()-1;i>=0;i--)
		{	
			srt+=s.charAt(i);
		}
	return srt;
}
}