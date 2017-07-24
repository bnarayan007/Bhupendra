public class A{
public int add(int x,int y){
return x+y;
}
public double add(int x,double y){
return x+y;
}
}
public class W{
public static void main(String args[]){
A a=new A();
int p=20;
int q=30;
int result=a.add(p,q);
double Result=a.add(22,9.3);
System.out.println(result+"\n"+Result);
}}