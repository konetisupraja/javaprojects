import java.io.fileOutputStream;
public class FileOutputStreamExample{
public static void main(String args[]){
try{
FileOutputStream fout=new FileOutputStream("C://testout.txt");
String msg ="Welcome";
byte byteArray[]=msg.getByte();
fileOutputStream.write(byteArray);
System.out.println("Welcome");
}
catch (Exception e)
{
System.out.println(e);
}
}
}