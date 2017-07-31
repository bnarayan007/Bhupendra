class string13{  
 int rollno;  
 String name;  
 String city;  
  
 string13(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
   
// public String toString(){//overriding the toString() method  
 // return rollno+" "+name+" "+city;  
// }  
 public static void main(String args[]){  
   string13 s1=new string13(101,"Raj","lucknow");  
   string13 s2=new string13(102,"Vijay","ghaziabad");  
     
   System.out.println(s1);//compiler writes here s1.toString()  
   System.out.println(s2);//compiler writes here s2.toString()  
 }  
}  