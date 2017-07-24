interface printable
{
	void print();
}
interface machine
{
	void print();
}
class a2 implements printable,machine
{
	public void print()
	{
		System.out.println("hello users");
	}	
	public static void main(String[] args)
	{
		a2 a1=new a2();
		a1.print();
	}
}