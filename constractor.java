class Student5
{
int id;
String name;
int age;
Student5(int id,String name)
{
id=id;
name=name;
this.age=0;
}
Student5(int i,String n,int a)
{
id=i;
name=n;
age=a;
void display(){System.out.println(i+" "+n+" "+a);
}
public static void main)(String[] args)
{
Student5 s1=new Student5(111,"sanju",25);
Student5 s2=new Student5(222,"suppu",23);
s1.display();
s2.display();
}
}