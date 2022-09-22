import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Manager2 {
	
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//CRUD - create,read,update,delete or drop 
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		
		Connection con = null;
		Statement stmt = null;
		ResultSet RS = null;
		try {
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
			int i = stmt.executeUpdate(query);
			
			System.out.println(i);
			
			
			System.out.println(i > 0 ? "inserted":"not insert");
			
			 query = "select * from student";
			 RS = stmt.executeQuery(query);//DQL  select
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
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			con.close();
			stmt.close();
			RS.close();
		}
		
		System.out.println("Done");
		
		//step 1 : using Class.forName upload mysql driver type 4 drive
				
			//step 2 : create the connection by mysql url 
				//load the address from DrivetManager class in driver getConnection is method  
				
			//statement is using sending query to the database	
				 
				
				
				//executeQuery is method statement is sending query by executeQuery
				//after received the stmt query database will send back table_date capsuling with ResultSet 
				//DQL  select 
				
				//1.stmt.execute(query)
				//2.stmt.executeUpdate(query);-> returning -> int(insert into tab1 values())
				//3.stmt.executeQuery();
				 
				//here reading all rows and columns  
				
				
				//query="insert into student values(05,'React')";
				
		
		

	}

}