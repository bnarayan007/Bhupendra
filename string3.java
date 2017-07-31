class string3
{
	public static void main(String[] args)
	{
	StringBuffer sb =new StringBuffer("abs");
		sb.append("common");
		System.out.println(sb);
		String s="abc";
		s=s.concat("ravi");      //string class is immutable means a new object is created in order concate this
		System.out.println(s);

}
}
