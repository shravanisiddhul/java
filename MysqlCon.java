import java.sql.*;
 
public class MysqlCon{
 
	public static void main(String[] args) {
 
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/temple","root",""); 
			System.out.println("Database connected successfully");
		}
		catch(Exception ex)
		{
			System.out.println("error in connection");
		}
    }

}