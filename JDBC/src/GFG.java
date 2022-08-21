import java.sql.*;
public class GFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mydb",
                "root", "admin");
 
            // mydb is database
            // mydbuser is name of database
            // mydbuser is password of database
 
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                "select * from mydb.mydb");
            int mydbid;
            String name;
            while (resultSet.next()) {
                mydbid = resultSet.getInt("mydbid");
                name = resultSet.getString("username");
                System.out.println("mydbid : " + mydbid
                                   + " Username : " + name);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }
	}

}
