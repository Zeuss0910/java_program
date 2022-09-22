import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager2 {
static 
{
try 
{
Class.forName("com.mysql.jdbc.Driver");
} 
catch (ClassNotFoundException e) 
{
e.printStackTrace();
}
}
public static void main(String[] args) throws ClassNotFoundException, SQLException 
{
Connection con = null;
Statement stmt = null;
ResultSet RS = null;
try
{
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college_db","root","");
stmt = con.createStatement();
String query = "select * from student";
System.out.println(query);
RS = stmt.executeQuery(query);
while(RS.next())
{
System.out.println(RS.getInt(1)+","+RS.getString(2) );
}
query=   "delete from student where S_name='Angular'";
int i = stmt.executeUpdate(query)			
System.out.println(i);
System.out.println(i > 0 ? "inserted":"not insert");
query = "select * from student";
RS = stmt.executeQuery(query);
while(RS.next())
{
System.out.println(RS.getInt(1)+","+RS.getString(2) );
}
System.out.println("Connected ...");
query="CREATE  TABLE tab1(id int AUTO_INCREMENT PRIMARY key,d_name varchar(99))";
boolean obj = stmt.execute(query);
System.out.println(obj);
}
catch(SQLException ex)
{
ex.printStackTrace();
}
catch (Exception e) 
{
e.printStackTrace();
}
finally 
{
con.close();
stmt.close();
RS.close();
}		
System.out.println("Done");
}
}
