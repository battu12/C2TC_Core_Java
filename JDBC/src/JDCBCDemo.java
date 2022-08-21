import java.sql.*;
public class JDCBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		{
	        String driverClassName
	            = "sun.jdbc.odbc.JdbcOdbcDriver";
	        String url = "jdbc:mysql://localhost:3306/greet";
	        String username = "root";
	        String password = "admin";
	        String query
	            = "insert into student values(109, 'Ash')";
	  
	        // Load driver class
	        Class.forName(driverClassName);
	  
	        // Obtain a connection
	        Connection con = DriverManager.getConnection(
	            url, username, password);
	  
	        // Obtain a statement
	        Statement st = con.createStatement();
	  
	        // Execute the query
	        int count = st.executeUpdate(query);
	        System.out.println(
	            "number of rows affected by this query= "
	            + count);
	  
	        // Closing the connection as per the
	        // requirement with connection is completed
	        con.close();
	}
	}
}
