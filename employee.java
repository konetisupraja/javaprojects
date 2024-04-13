class Employee//java beam
{
private int age;
public void setAge(int age)//setter method
{
if(age>100)
{
this.age=100;
}
else if(age<10)
{
this.age=0;
}
else
{
this.age=age;
}
}
public int getAge()
{
return age;
}
}
class main
{
public static void main(String[] args)
{
Employee obj=new Employee();
obj.setAge(20);
int x=obj.getAge();
System.out.println("the age of employee is:"+x);
}
}
