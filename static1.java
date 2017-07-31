public class static1 {
static int count=0;
public void increment(){
count++;
}
public static void main(String[] args)
{
static1 sv1=new static1();
static1 sv2=new static1();
sv1.increment();
sv2.increment();
System.out.println("sv1.count="+sv1.count);
System.out.println("sv2.count="+sv2.count);
}
}
