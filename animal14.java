interface dog
{
	void eat();
}
interface cat
{
	void behave();
}
class animal14 implements dog,cat
{
	public void eat()
	{
		System.out.println("dog eat pedigree");
	}
	public void behave()
	{
		System.out.println("cat says meooowww");
	}
	public static void main(String[] args)
	{
		animal14 a1=new animal14();
		a1.eat();
		a1.behave();
	}
}