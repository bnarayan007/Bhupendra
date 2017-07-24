abstract class bike
{
	bike()
	{
		System.out.println("bike is created");
	}
	abstract void model();
	void changegear()
	{
		System.out.println("gear change kr bhai");
	}
}
class apache extends bike
{
	void model()
	{
		System.out.println("model of bike is 2.0");
	}
}
class abstraction
{
	public static void main(String[] args)
	{
		apache a1=new apache();
		a1.model();
		a1.changegear();
	}
}

