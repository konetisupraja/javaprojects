 class B {
public static void main(String[] args) {
try {
int a[]=new int[6];
a[7]=1/0;
}
catch(ArithemeticException ae)
{
System.out.println(ae);
}
catch(ArrayIndexOutOfBoundException ae)
{
}
}
}