class abc
{
int rollno;
string name;
string dept;
abc(int id,string a,string b)

{
rollno=id;
name=a;
dept=b;


}
void display()
{

System.out.println("Rollno:"+rollno + "Name:"+name + "Dep:"+dept);
}

}
class abd{
public static void main(String args[]){
abc iv=new abc (23,"baba","it");
iv.display();
}}
