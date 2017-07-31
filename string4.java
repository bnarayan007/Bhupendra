class string4
{
	public static void main(String[] args)
	{
		String s="bhupendra";
		s=myreverse(s);
		System.out.println(s);
	}
	public static String myreverse(String s)
	{      System.out.println(s);
  		StringBuffer sb =new StringBuffer();
		for(int i=s.length()-1;i>=0;i--)
		{
			
			System.out.println(s.charAt(i)); 
			sb.append(s.charAt(i));
		}
	return sb.toString();
	}

}