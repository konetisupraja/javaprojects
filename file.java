import java.io.fileOutputStream;
public class FileOutputStreamExample{
public static void main(String args[]){
try{
FileOutputStream fout=new FileOutputStream("C://testout.txt");
fout.write965);
fout.flush():
fout.close():
System.out.println("sucess...");
}
catch(Exception e){
System.out.println(e);
}
}
}