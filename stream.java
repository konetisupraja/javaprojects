import java.io.FileOutputStream;
class FileOutputStreamExample{
public static void main(String args[]){
String s="hello java";
try{
FileOutputStream fout=new FileOutputStream("C:\\java\\testout.txt");
byte[] b=s.getBytes();
fout.write(b);
fout.flush();
fout.close();
System.out.println("success...");
}
catch(Exception e)
{
System.out.println(e);
}
}
}