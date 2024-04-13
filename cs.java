class Student{
int rollno;
String name;
String city;
Student(int rollno,String name,String city){
this.rollno=rollno;
this.name=name;
this.city=city;
}
public String toString(){
return "Welcome";
}
public static void main(String args[]){
Student s1=new Student(101,"sandeep","warngal");
Student s2=new Student(102,"deepthi","mahabubabad");
System.out.println(s1);
System.out.pritnln(s2);
}
}