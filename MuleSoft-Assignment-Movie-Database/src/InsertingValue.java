
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertingValue {
	
	public static void main(String[] args) {
		
		String url = "jdbc:sqlite:F:/Mulesoft Resources/SQLiteStudio/Movies.db";
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
			Statement st = conn.createStatement();
			System.out.println("-----------Inserting records into the table-----------");          
			String sql = "INSERT INTO Movies VALUES (1,'Googly', 'Yash', 'Kruti', 2014, 'Pava Waddeyar')";
			st.executeUpdate(sql);
			sql = "INSERT INTO Movies VALUES (2, 'Ega', 'Sudeep', 'Samanta',2012,'Rajamouli')";
			st.executeUpdate(sql);
			sql = "INSERT INTO Movies VALUES (3, 'KGF', 'Yash','Srinidhi Shetty', 2022 ,'Prashanth Neel')";
			st.executeUpdate(sql);
			sql = "INSERT INTO Movies VALUES (4, '3 Iditos','Amir Khan', 'Kareena Kapoor', 2009,'Rajkumar Hirani‎r')";
			st.executeUpdate(sql);
			System.out.println("----------Inserted records into the table--------");   	  
      } 
		catch (SQLException e) {
			e.printStackTrace();
      } 
   }
}