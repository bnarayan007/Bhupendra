class var
{
static int count=0;
public void increment()
{count ++;}
}
class as
{
public static void main(String args[])
{
var sv1=new var();
var sv2=new var();
sv1.increment();
sv2.increment();
System.out.println("sv1.count="+sv1.count);
System.out.println("sv2.count="+sv2.count);
}



}