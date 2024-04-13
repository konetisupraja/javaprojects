import java.sql.*;
import com.mtysql.cj.jdbc.Driver;
public class Main{
public static void main(Strings[] args){
String url="jdbc:mysql://localhost:3306/peters";
string unname="root";
string pwd="root";
try{
Driver d=new Driver();
DriverManger.registerDrive(d);
connection c = Drivermanager.getConnection(url,uname,pwd);
statement s = c.createStatement();
ResultSet rs = s.executeQuery("select*from Student)