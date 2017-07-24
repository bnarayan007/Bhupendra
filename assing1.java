class assing1
{
	public static void test(String s)
	{
		System.out.println("in string");
	}
	public static void test(Object o)
	{
		System.out.println("in object");
	}
	public static void main(String[] args)
	{
		test(null);
	}
}