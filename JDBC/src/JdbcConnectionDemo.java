import java.sql.*;
public class JdbcConnectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String JdbcURL = "jdbc:mysql://localhost:3306/mydb";
	      String Username = "root";
	      String password = "admin";
	      Connection con = null;
	      try {
	         System.out.println("Connecting to database..............."+JdbcURL);
	         con=DriverManager.getConnection(JdbcURL, Username, password);
	         System.out.println("Connection is successful!!!!!!");
	      }
	      catch(Exception e) {
	         e.printStackTrace();
	      }
	   
	}

}
