interface printable
{
	void print();
}
interface machine extends printable
{
	void show();
}
class a3 implements machine
{
	public void print()
	{
		System.out.println("hello");
	}
	public void show()
	{	
		System.out.println("users");
	}
	public static void main(String[] args)
	{
		a3 a=new a3();
		a.print();
		a.show();
	}
}
	